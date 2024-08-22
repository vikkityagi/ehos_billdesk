package com.ehospital.billdesk.billdeskdemo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    
    @JsonProperty("card_number")
    private String number;

    @JsonProperty("expiry_month")
    private String expiryMonth;

    @JsonProperty("expiry_year")
    private String expiryYear;
    
    @JsonProperty("cvv")
    private String cvv;

    @JsonProperty("holder_name")
    private String holderName;

}
