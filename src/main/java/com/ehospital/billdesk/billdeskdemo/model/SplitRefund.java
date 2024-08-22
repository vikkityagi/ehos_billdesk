package com.ehospital.billdesk.billdeskdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="split_refunds")

public class SplitRefund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mercId;
    private double txnAmount;
    private double refundAmount;
    private String refundStatus;

    // Constructors, getters, and setters
    // Omitted for brevity

    public SplitRefund() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
