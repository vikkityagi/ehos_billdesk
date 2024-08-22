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
@Table(name="devices")

public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acceptHeader;
    private String initChannel;
    private String ip;
    private String userAgent;
    private String browserLanguage;
    private boolean browserJavascriptEnabled;
    private String browserTz;
    private int browserColorDepth;
    private boolean browserJavaEnabled;
    private int browserScreenHeight;
    private int browserScreenWidth;

    // Constructors, getters, and setters
    // Omitted for brevity

    public Device() {
    }

    // Getters and setters for all fields (recommended)
    // Omitted for brevity
}
