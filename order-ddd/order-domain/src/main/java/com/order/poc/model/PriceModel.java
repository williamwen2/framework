package com.order.poc.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Order price
 * **/
@Data
public class PriceModel {

    private BigDecimal totalAmount;

    private BigDecimal totalPrice;

    private BigDecimal taxAmount;

    private BigDecimal taxPrice;

    private DiscountModel discount;

}
