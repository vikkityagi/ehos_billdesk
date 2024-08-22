package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("mercid")
    private String mercId;

    @JsonProperty("order_date")
    private String orderDate;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("ru")
    private String ru;

    @JsonProperty("additional_info")
    private String additionalInfo;

    @JsonProperty("itemcode")
    private String itemCode;

    @JsonProperty("settlement_lob")
    private String settlementLob;

    @JsonProperty("customer")
    
    private Customer customer;

    @JsonProperty("device")
    
    private Device device;

    @JsonProperty("invoice")
    
    private Invoice invoice;

    @JsonProperty("split_payment")
    @JsonUnwrapped
    private SplitPayment splitPayment;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Order() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
