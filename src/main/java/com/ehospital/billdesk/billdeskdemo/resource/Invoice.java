package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Invoice {

    @JsonProperty("invoice_number")
    private String invoiceNumber;

    @JsonProperty("invoice_display_number")
    private String invoiceDisplayNumber;

    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("invoice_date")
    private String invoiceDate;

    @JsonProperty("gst_details")
    private GstDetails gstDetails;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Invoice() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity

    public static class GstDetails {

        @JsonProperty("cgst")
        private String cgst;

        @JsonProperty("sgst")
        private String sgst;

        @JsonProperty("igst")
        private String igst;

        @JsonProperty("gst")
        private String gst;

        @JsonProperty("cess")
        private String cess;

        @JsonProperty("gstincentive")
        private String gstIncentive;

        @JsonProperty("gstpct")
        private String gstPct;

        // Constructors, getters, and setters
        // Omitted for brevity

        public GstDetails() {
            cgst="8.00";
            sgst="8.00";
            gst="16.00";
            gstPct="16.00";
            cess="0.00";
            gstIncentive="0.00";
            igst="0.00";
        }

        // Getters and setters for all fields (recommended)
        // Omitted for brevity
    }
}
