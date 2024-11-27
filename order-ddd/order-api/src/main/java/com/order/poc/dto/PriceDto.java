package com.order.poc.dto;

import lombok.Data;

import java.math.BigDecimal;
/**
 * price elements of order dto
 * **/
@Data
public class PriceDto {

    private BigDecimal totalAmount;

    private BigDecimal totalPrice;

    private BigDecimal taxAmount;

    private BigDecimal taxPrice;

    private DiscountDto discount;
}
