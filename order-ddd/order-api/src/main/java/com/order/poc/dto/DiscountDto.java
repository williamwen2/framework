package com.order.poc.dto;

import com.order.poc.dto.enumDto.DiscountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DiscountDto {

    private DiscountType priceType;

    private BigDecimal amount;
}
