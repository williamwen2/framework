package com.order.poc.model;

import lombok.Data;

/**
 * Order domain model
 * **/
@Data
public class OrderModel {

    /**
     * orderNo, not a db ID
     * **/
    private String orderNo;

    /**
     * customerId
     * **/
    private String customerId;

    /**
     * price
     * **/
    private PriceModel price;
}
