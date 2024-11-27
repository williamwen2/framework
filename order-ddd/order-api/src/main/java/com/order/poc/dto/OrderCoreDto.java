package com.order.poc.dto;

import lombok.Data;

/**
 * order core elements dto
 * **/
@Data
public class OrderCoreDto {

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
    private PriceDto price;
}
