package com.order.poc.model.enums;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum PriceType implements Serializable {

    PriceType("");
    private String value;
    private static Map<String, PriceType> containsMap = new HashMap<>();
    static {
        for (PriceType priceType : values()) {
            containsMap.put(PriceType.getValue(), priceType);
        }
    }

    public PriceType(String value) {
        this.value = value;
    }


    public static PriceType fromCode(String value){
        PriceType priceType = containsMap.get(value);
        if(priceType == null){
            //throw CommonError.PARAMETER_IS_INVALID.toException("");
        }
        return priceType;
    }

    public String getValue() {
        return value;
    }
}
