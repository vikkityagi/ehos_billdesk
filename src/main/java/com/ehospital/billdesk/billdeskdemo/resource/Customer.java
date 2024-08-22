package com.ehospital.billdesk.billdeskdemo.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("email_alt")
    private String emailAlt;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("mobile_alt")
    private String mobileAlt;

    // Constructor
    public Customer() {
    }
}
