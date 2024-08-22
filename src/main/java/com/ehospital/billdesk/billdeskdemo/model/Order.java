package com.ehospital.billdesk.billdeskdemo.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String mercId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    private double amount;
    private String currency;
    private String ru;
    private String additionalInfo;
    private String itemCode;
    private String settlementLob;
    private String customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "device_id")
    private Device device;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "split_payment_id")
    private SplitPayment splitPayment;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Order() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
