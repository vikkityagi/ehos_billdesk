package com.ehospital.billdesk.billdeskdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String emailAlt;
    private String mobile;
    private String mobileAlt;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Customer() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
