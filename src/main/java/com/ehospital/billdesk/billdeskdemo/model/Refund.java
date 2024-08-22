package com.ehospital.billdesk.billdeskdemo.model;

import java.util.Date;

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
@Table(name="refunds")

public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objectId;
    private String refundId;
    private String transactionId;
    private String orderId;
    private String mercId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    private double txnAmount;
    private double refundAmount;
    private String refundStatus;
    private String currency;
    private String device;

    @Temporal(TemporalType.TIMESTAMP)
    private Date refundDate;

    private String refundArn;
    private String mercRefundRefNo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bankRefundDate;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Refund() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
