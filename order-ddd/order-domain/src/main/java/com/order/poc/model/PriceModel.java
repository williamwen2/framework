package com.order.poc.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Order price
 * **/
@Data
public class PriceModel {

    /**
     * product amount of one order
     * **/
    private BigDecimal totalAmount;

    /**
     * product price
     * **/
    private BigDecimal totalPrice;

    /**
     * tax records number of one order
     * **/
    private BigDecimal taxAmount;

    /**
     * total tax price
     * **/
    private BigDecimal taxPrice;

    private DiscountModel discount;

}
