package com.ehospital.billdesk.billdeskdemo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehospital.billdesk.billdeskdemo.resource.Order;
import com.ehospital.billdesk.billdeskdemo.repository.OrderRepository;
import com.ehospital.billdesk.billdeskdemo.resource.Device;
import com.ehospital.billdesk.billdeskdemo.resource.Invoice;
import com.ehospital.billdesk.billdeskdemo.resource.Invoice.GstDetails;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createTestOrder() {
        // Implement any business logic/validation here
        Order order = new Order();
        order.setMercId("XNICHOSPIT");
        order.setOrderId("1");

        order.setAmount("100");
        order.setOrderDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));
        order.setCurrency("356");
        order.setRu("https://nextgen.ehospital.nic.in/");
        order.setAdditionalInfo("{}");
        order.setItemCode("DIRECT");
        Device device = new Device();
        device.setInitChannel("internet");
        device.setIp("192.168.55.55");
        device.setUserAgent("\"Mozilla/5.0(WindowsNT10.0;WOW64;rv:51.0)Gecko/20100101\r\n" + //
                " Firefox/51.0");
        device.setAcceptHeader("text/html");
        device.setBrowserTz("-330");
        device.setBrowserColorDepth("32");
        device.setBrowserJavaEnabled("false");
        device.setBrowserScreenHeight("601");
        device.setBrowserScreenWidth("657");
        device.setBrowserLanguage("en-US");
        device.setBrowserJavascriptEnabled("true");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("test user");
        invoice.setInvoiceNumber("123");
        invoice.setInvoiceDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()));
        invoice.setInvoiceDisplayNumber("123");
        invoice.setGstDetails(new GstDetails());

        order.setDevice(device);
        order.setInvoice(invoice);
        return order;
    }
}
