package com.order.poc.model.enums;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum DiscountType implements Serializable {

    /**
     * discount
     * **/
    DISCOUNT("DISCOUNT"),

    /**
     * subsidy
     * **/
    SUBSIDY("SUBSIDY"),

    /**
     * combination
     * **/
    COMBINATION("COMBINATION");
    private String value;
    private static Map<String, DiscountType> containsMap = new HashMap<>();
    static {
        for (DiscountType priceType : values()) {
            containsMap.put(priceType.getValue(), priceType);
        }
    }

    DiscountType(String value) {
        this.value = value;
    }


    public static DiscountType fromCode(String value){
        DiscountType priceType = containsMap.get(value);
        if(priceType == null){
            //throw CommonError.PARAMETER_IS_INVALID.toException("");
        }
        return priceType;
    }

    public String getValue() {
        return value;
    }
}
