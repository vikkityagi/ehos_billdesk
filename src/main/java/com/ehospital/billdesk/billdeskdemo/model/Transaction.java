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
@Table(name="transactions")

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objectId;
    private String transactionId;
    private String orderId;
    private String mercId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    private double amount;
    private double surcharge;
    private double discount;
    private double chargeAmount;
    private String currency;
    private String txnProcessType;
    private String bankId;
    private String ru;
    private String additionalInfo;
    private String itemCode;
    private String bankRefNo;
    private String authStatus;
    private String settlementLob;
    private String customer;
    private String device;
    private String transactionErrorCode;
    private String transactionErrorType;
    private String transactionErrorDesc;
    private String authCode;
    private String eci;
    private String paymentMethodType;
    private String card;
    private String links;
    private boolean splitPayment;
    private String paymentCategory;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Transaction() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
