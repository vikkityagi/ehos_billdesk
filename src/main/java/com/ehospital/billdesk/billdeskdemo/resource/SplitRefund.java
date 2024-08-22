package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SplitRefund {

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("txn_amount")
    private double txnAmount;

    @JsonProperty("refund_amount")
    private double refundAmount;

    @JsonProperty("refund_status")
    private String refundStatus;

    // Constructor
    public SplitRefund() {
    }

    // Getters and setters (optional, not included as per your request)
}
