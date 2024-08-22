package com.ehospital.billdesk.billdeskdemo.model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="invoices")

public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceNumber;
    private String invoiceDisplayNumber;
    private String customerName;

    @Embedded
    private GstDetails gstDetails;

    @Temporal(TemporalType.DATE)
    private java.util.Date invoiceDate;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Invoice() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity

    @Embeddable
    public static class GstDetails {
        private double cgst;
        private double sgst;
        private double igst;
        private double gst;
        private double cess;
        private double gstincentive;
        private double gstpct;

        // Constructors, getters, and setters
        // Omitted for brevity

        public GstDetails() {
        }

        // Getters and setters for all fields (recommended)
        // Omitted for brevity
    }
}
