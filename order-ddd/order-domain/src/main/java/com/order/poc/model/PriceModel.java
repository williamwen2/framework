package com.order.poc.model;

import com.order.poc.model.enums.PriceType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceModel {

    private PriceType priceType;

    private BigDecimal totalAmount;

    private BigDecimal totalPrice;

    private BigDecimal taxAmount;

    private BigDecimal taxPrice;

    private BigDecimal discountAmount;

    private BigDecimal discountPrice;

}
