package com.ehospital.billdesk.billdeskdemo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("auth_type")
    private String authType;

    @JsonProperty("3ds_parameter")
    private String threeDSParameter;

    @JsonProperty("bankid")
    private String bankId;

    @JsonProperty("ru")
    private String ru;

    @JsonProperty("additional_info")
    private String additionalInfo;

    @JsonProperty("item_code")
    private String itemCode;


    @JsonProperty("payment_method_type")
    private String paymentMethodType;

    @JsonProperty("txn_process_type")
    private String txnProcessType;

    @JsonProperty("settlement_lob")
    private String settlementLob;

    @JsonProperty("customer_refid")
    private String customerRefid;
   
    @JsonProperty("device")
    private Device device;

    @JsonProperty("customer")
    private Customer customer;

    @JsonProperty("card")
    private Card card;

    @JsonProperty("upi")
    private Map<String, String> upi;


    @JsonProperty("avs")
    private Map<String, List<Map<String, String>>> avs;
    

}
