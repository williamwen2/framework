package com.order.poc.model.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * product type
 * **/
public enum ProductType {

    /**
     * VEHICLE
     * **/
    VEHICLE("VEHICLE"),

    /**
     * RENT
     **/
    RENT("RENT"),

    /**
     * SECOND_HAND VEHICLE
     **/
    SECOND_HAND("SECOND_HAND"),

    /**
     * SERVICE
     **/
    SERVICE("SERVICE"),

    /**
     * ADDITIONAL
     * **/
    ADDITIONAL("ADDITIONAL");
    private String value;
    private static Map<String, ProductType> containsMap = new HashMap<>();
    static {
        for (ProductType productType : values()) {
            containsMap.put(productType.getValue(), productType);
        }
    }

    ProductType(String value) {
        this.value = value;
    }


    public static ProductType fromCode(String value){
        ProductType productType = containsMap.get(value);
        if(productType == null){
            //throw CommonError.PARAMETER_IS_INVALID.toException("");
        }
        return productType;
    }

    public String getValue() {
        return value;
    }
}
