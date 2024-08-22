package com.ehospital.billdesk.billdeskdemo.model;

import jakarta.persistence.Column;
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
@Table(name="transaction_card")
public class Card {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="card_number")
    private String number;

    @Column(name="expiry_month")
    private String expiryMonth;

    @Column(name="expiry_year")
    private String expiryYear;
    
    @Column(name="cvv")
    private String cvv;

    @Column(name="holder_name")
    private String holderName;

}
