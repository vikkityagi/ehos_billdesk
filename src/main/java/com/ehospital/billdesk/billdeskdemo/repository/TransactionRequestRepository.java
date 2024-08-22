package com.ehospital.billdesk.billdeskdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ehospital.billdesk.billdeskdemo.model.TransactionRequest;
import com.ehospital.billdesk.billdeskdemo.resource.TransactionResponse;

@Repository
public interface TransactionRequestRepository extends JpaRepository<TransactionRequest, Long> {
    // You can define custom query methods if needed
}
