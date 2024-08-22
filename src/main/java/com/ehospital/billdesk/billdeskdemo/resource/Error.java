package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {

    @JsonProperty("status")
    private String status;

    @JsonProperty("error_type")
    private String errorType;

    @JsonProperty("error_code")
    private String errorCode;

    @JsonProperty("message")
    private String message;

    // Constructor
    public Error() {
    }

    // Getters and setters (optional, not included as per your request)
}
