package com.order.poc.model;

import com.order.poc.model.enums.ProductType;
import lombok.Data;

/**
 * Order price
 * **/
@Data
public class ProductModel {

    /**
     * product id
     * **/
    private String productId;

    /**
     * product enum type:
     * 1.new vehicle
     * 2.rent
     * 3.second-hand vehicle
     * 4.service
     * 5.additional product
     * **/
    private ProductType productType;

    /**
     * primary product
     * e.g. vehicle is primary product, services and additional products are related products
     * **/
    boolean isPrimary;



}
