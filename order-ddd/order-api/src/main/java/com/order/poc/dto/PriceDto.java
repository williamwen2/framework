package com.order.poc.dto;

import java.math.BigDecimal;

public class PriceDto {

    private BigDecimal totalAmount;

    private BigDecimal totalPrice;

    private BigDecimal taxAmount;

    private BigDecimal taxPrice;

    private DiscountModel discount;
}
