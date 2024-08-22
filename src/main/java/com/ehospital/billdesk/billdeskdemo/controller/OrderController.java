package com.ehospital.billdesk.billdeskdemo.controller;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ehospital.billdesk.billdeskdemo.resource.Order;
import com.ehospital.billdesk.billdeskdemo.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create/{orderId}")
    public ResponseEntity<Order> createOrder(@PathVariable ("orderId") String orderId) {
        try {
            String secret = "PoByRRsrxT5Z8KurqDQjtOd0xkFr8GBy"; // Use a more secure key in production

            // Create the algorithm
            Algorithm algorithm = Algorithm.HMAC256(secret);

            // Create the header
            Map<String, Object> header = new HashMap<>();
            header.put("alg", "HS256");
            header.put("xnichospit", "XNICHOSPIT");

            // create the payload
            Map<String, Object> payload = null;

            Order createdOrder = orderService.createTestOrder();
            createdOrder.setOrderId(orderId);
            ObjectMapper mapper = new ObjectMapper();
            payload = mapper.convertValue(createdOrder, Map.class);

            String headerJson = mapper.writeValueAsString(header);
            String payloadJson = mapper.writeValueAsString(payload);

            // Display the JSON
            logger.info("Header JSON: " + headerJson);
            logger.info("Payload JSON: " + payloadJson);

            // Create the JWT
            com.auth0.jwt.JWTCreator.Builder builder = JWT.create();
            // add header to jwt
            builder.withHeader(header);
            // add payload to jwt
            for (Map.Entry<String, Object> entry : payload.entrySet()) {
                if (entry.getValue() != null)
                    builder.withClaim(entry.getKey(), entry.getValue().toString());

            }
            // create jws token
            String token = builder.sign(algorithm);

            System.out.println("Generated JWT: " + token);

            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT decodedJWT = verifier.verify(token);

            logger.info("JWT verification succeeded.");
            logger.info("Subject: " + decodedJWT.getSubject());
            logger.info("orderid ID: " + decodedJWT.getClaim("orderid").asString());
            logger.info("amount: " + decodedJWT.getClaim("amount").asString());
            logger.info("currency: " + decodedJWT.getClaim("currency").asString());
            long epochTimestamp = Instant.now().getEpochSecond();
            logger.info("Current epoch timestamp:" + epochTimestamp);

            String url = "https://uat1.billdesk.com/u2/payments/ve1_2/transactions/create";

            // Prepare request body
            String requestBody = token;

            // Set headers
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/jose");
            headers.set("accept", "application/jose");
            headers.set("bd-timestamp",  Instant.now().getEpochSecond()+"");
            headers.set("bd-traceid",  Instant.now().getEpochSecond()+"");
            

            HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
             
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

            // Handle the response
            if (response.getStatusCode().is2xxSuccessful()) {
                logger.info("Response: " + response.getBody());
                return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
            } else {
                logger.info("Request failed with status code: " + response.getStatusCode());
                return ResponseEntity.badRequest().body(null);
            }

           
        } catch (Throwable t) {
            logger.error("Exception occured", t);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
