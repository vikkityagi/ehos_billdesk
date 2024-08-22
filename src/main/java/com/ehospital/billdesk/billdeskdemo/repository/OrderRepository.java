package com.ehospital.billdesk.billdeskdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ehospital.billdesk.billdeskdemo.model.*;
public interface OrderRepository extends JpaRepository<Order, Long> {
    // You can define custom query methods if needed
}
