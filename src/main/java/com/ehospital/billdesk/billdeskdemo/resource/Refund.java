package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Refund {

    @JsonProperty("objectid")
    private String objectId;

    @JsonProperty("refundid")
    private String refundId;

    @JsonProperty("transactionid")
    private String transactionId;

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("transaction_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date transactionDate;

    @JsonProperty("txn_amount")
    private double txnAmount;

    @JsonProperty("refund_amount")
    private double refundAmount;

    @JsonProperty("refund_status")
    private String refundStatus;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("device")
    private String device;

    @JsonProperty("refund_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date refundDate;

    @JsonProperty("refund_arn")
    private String refundArn;

    @JsonProperty("merc_refund_ref_no")
    private String mercRefundRefNo;

    @JsonProperty("bank_refund_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date bankRefundDate;

    // Constructor
    public Refund() {
    }
}
