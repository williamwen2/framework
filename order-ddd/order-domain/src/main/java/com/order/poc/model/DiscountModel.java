package com.order.poc.model;

import com.order.poc.model.enums.DiscountType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Discount Model
 * **/
@Data
public class DiscountModel {


    private DiscountType priceType;

    private BigDecimal amount;
}
