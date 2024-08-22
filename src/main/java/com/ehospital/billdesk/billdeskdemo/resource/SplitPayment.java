package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SplitPayment {

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("amount")
    private double amount;

    // Constructor
    public SplitPayment() {
    }

    // Getters and setters (optional, not included as per your request)
}
