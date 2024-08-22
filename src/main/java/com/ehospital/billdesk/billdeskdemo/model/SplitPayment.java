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
@Table(name="split_payments")

public class SplitPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mercId;
    private double amount;

    // Constructors, getters, and setters
    // Omitted for brevity

    public SplitPayment() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
