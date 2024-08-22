package com.ehospital.billdesk.billdeskdemo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ehospital.billdesk.billdeskdemo.resource.Device;
import com.ehospital.billdesk.billdeskdemo.resource.Invoice;
import com.ehospital.billdesk.billdeskdemo.resource.Invoice.GstDetails;
import com.ehospital.billdesk.billdeskdemo.resource.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class TestMain {
    public static void main(String[] args) {
        // Generate a key
        try {
            String secret = "PoByRRsrxT5Z8KurqDQjtOd0xkFr8GBy"; // Use a more secure key in production

            // Create the algorithm
            Algorithm algorithm = Algorithm.HMAC256(secret);

            // Create the header
            Map<String, Object> header = new HashMap<>();
            header.put("alg", "HS256");
            header.put("xnichospit", "XNICHOSPIT");

            // Create the payload
            Map<String, Object> payload = null;

            // Create Order Object

            Order order = new Order();
            order.setMercId("XNICHOSPIT");
            order.setOrderId("1");

            order.setAmount("100");
            order.setOrderDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));
            order.setCurrency("356");
            order.setRu("https://nextgen.ehospital.nic.in/");
            order.setAdditionalInfo("{}");
            order.setItemCode("DIRECT");
            Device device = new Device();
            device.setInitChannel("internet");
            device.setIp("192.168.55.55");
            device.setUserAgent("\"Mozilla/5.0(WindowsNT10.0;WOW64;rv:51.0)Gecko/20100101\r\n" + //
                                " Firefox/51.0");
            device.setAcceptHeader("text/html");
            device.setBrowserTz("-330");
            device.setBrowserColorDepth("32");
            device.setBrowserJavaEnabled("false");
            device.setBrowserScreenHeight("601");
            device.setBrowserScreenWidth("657");
            device.setBrowserLanguage("en-US");
            device.setBrowserJavascriptEnabled("true");
            Invoice invoice = new Invoice();
            invoice.setCustomerName("test user");
            invoice.setInvoiceNumber("123");
            invoice.setInvoiceDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));
            invoice.setInvoiceDisplayNumber("123");
            invoice.setGstDetails(new GstDetails());

            order.setDevice(device);
            order.setInvoice(invoice);
            ObjectMapper mapper = new ObjectMapper();

            payload = mapper.convertValue(order, Map.class);

            // Convert header and payload to JSON strings
            String headerJson = mapper.writeValueAsString(header);
            String payloadJson = mapper.writeValueAsString(payload);

            // Display the JSON
            System.out.println("Header JSON: " + headerJson);
            System.out.println("Payload JSON: " + payloadJson);

            // Create the JWT
            com.auth0.jwt.JWTCreator.Builder builder = JWT.create();
            
            for (Map.Entry<String, Object> entry : payload.entrySet()) {
                if(entry.getValue()!=null)
                builder.withClaim(entry.getKey(), entry.getValue().toString());

            }
            builder.withHeader(header);
            String token = builder.sign(algorithm);

            System.out.println("Generated JWT: " + token);

            // Verify the JWT
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT decodedJWT = verifier.verify(token);

            System.out.println("JWT verification succeeded.");
            System.out.println("Subject: " + decodedJWT.getSubject());
            System.out.println("orderid ID: " + decodedJWT.getClaim("orderid").asString());
            System.out.println("amount: " + decodedJWT.getClaim("amount").asString());
            System.out.println("currency: " + decodedJWT.getClaim("currency").asString());
             long epochTimestamp = Instant.now().getEpochSecond();
             System.out.println("Current epoch timestamp:"+ epochTimestamp);

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
