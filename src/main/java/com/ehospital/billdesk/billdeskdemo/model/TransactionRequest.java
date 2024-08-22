package com.ehospital.billdesk.billdeskdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction_requests")
public class TransactionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "merc_id")
    private String mercId;

    @Column(name = "amount")
    private String amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "auth_type")
    private String authType;

    @Column(name = "three_ds_parameter")
    private String threeDSParameter;

    @Column(name = "bank_id")
    private String bankId;

    @Column(name = "ru")
    private String ru;

    @Column(name = "additional_info")
    private String additionalInfo;

    @Column(name = "payment_method_type")
    private String paymentMethodType;

    @Column(name = "txn_process_type")
    private String txnProcessType;

    @Column(name = "settlement_lob")
    private String settlementLob;

    @Column(name = "customer_ref_id")
    private String customerRefid;

    // Assuming Device, Customer, Card, Upi are separate entities
    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    @JoinColumn(name = "vpa")
    private String vpa;

    // Getters and setters for all fields
    // Constructors, equals, hashCode, and toString methods

}
