package com.ehospital.billdesk.billdeskdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ehospital.billdesk.billdeskdemo.repository.TransactionRequestRepository;
import com.ehospital.billdesk.billdeskdemo.resource.Card;
import com.ehospital.billdesk.billdeskdemo.resource.Device;
import com.ehospital.billdesk.billdeskdemo.resource.TransactionRequest;

@Service
public class TransactionService {
    
    @Autowired
    private TransactionRequestRepository transactionRequestRepository;
     public TransactionRequest createTestTransaction() {
        // Implement any business logic/validation here
        
        TransactionRequest transactionRequest = new TransactionRequest();

        transactionRequest.setOrderId("1");
        transactionRequest.setMercId("XNICHOSPIT");
        transactionRequest.setAmount("100");
        transactionRequest.setCurrency("INR");
        transactionRequest.setItemCode("DIRECT");
        transactionRequest.setPaymentMethodType("upi");
        transactionRequest.setTxnProcessType("collect");

       

        Device device = new Device();
        device.setInitChannel("internet");
        device.setIp("192.168.55.55");
        device.setUserAgent("\"Mozilla/5.0(WindowsNT10.0;WOW64;rv:51.0)Gecko/20100101\r\n" + //
                " Firefox/51.0");
        // device.setAcceptHeader("text/html");
        // device.setBrowserTz("-330");
        // device.setBrowserColorDepth("32");
        // device.setBrowserJavaEnabled("false");
        // device.setBrowserScreenHeight("601");
        // device.setBrowserScreenWidth("657");
        // device.setBrowserLanguage("en-US");
        // device.setBrowserJavascriptEnabled("true");

        Map<String,String> upiParam = new HashMap<String, String>();
        upiParam.put("vpa", "billdesk@upi");

        transactionRequest.setUpi(upiParam);
        Map<String,String> accountNumber = new HashMap<>();
        accountNumber.put("number", "12340001234");
        accountNumber.put("ifsc", "ABCD0123456");
        List<Map<String,String>> accountList = new ArrayList<>();
        accountList.add(accountNumber);
        Map<String,List<Map<String,String>>> avsMap = new HashMap<>();
        avsMap.put("bankaccount", accountList);
        transactionRequest.setAvs(avsMap);
        
        transactionRequest.setDevice(device);

        return transactionRequest;

    }
}
