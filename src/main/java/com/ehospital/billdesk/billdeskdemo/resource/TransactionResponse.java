package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class TransactionResponse {

    @JsonProperty("objectid")
    private String objectId;

    @JsonProperty("transactionid")
    private String transactionId;

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("transaction_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date transactionDate;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("surcharge")
    private double surcharge;

    @JsonProperty("discount")
    private double discount;

    @JsonProperty("charge_amount")
    private double chargeAmount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("txn_process_type")
    private String txnProcessType;

    @JsonProperty("bankid")
    private String bankId;

    @JsonProperty("ru")
    private String ru;

    @JsonProperty("additional_info")
    private String additionalInfo;

    @JsonProperty("itemcode")
    private String itemCode;

    @JsonProperty("bank_ref_no")
    private String bankRefNo;

    @JsonProperty("auth_status")
    private String authStatus;

    @JsonProperty("settlement_lob")
    private String settlementLob;

    @JsonProperty("customer")
    private String customer;

    @JsonProperty("device")
    private String device;

    @JsonProperty("transaction_error_code")
    private String transactionErrorCode;

    @JsonProperty("transaction_error_type")
    private String transactionErrorType;

    @JsonProperty("transaction_error_desc")
    private String transactionErrorDesc;

    @JsonProperty("authcode")
    private String authCode;

    @JsonProperty("eci")
    private String eci;

    @JsonProperty("payment_method_type")
    private String paymentMethodType;

    @JsonProperty("card")
    private String card;

    @JsonProperty("links")
    private List<String> links;

    @JsonProperty("split_payment")
    private boolean splitPayment;

    @JsonProperty("payment_category")
    private String paymentCategory;

    
    @JsonProperty("avs")
    private Map<String, List<Map<String, String>>> avs;
    

    public TransactionResponse() {
    }
}
