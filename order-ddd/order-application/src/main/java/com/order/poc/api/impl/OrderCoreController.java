package com.order.poc.api.impl;

import com.order.poc.api.OrderCoreApi;
import com.order.poc.dto.OrderCoreDto;

import java.net.http.HttpResponse;

/**
 * implement Order core api, this scenario is controller style for web application
 * **/
public class OrderCoreController implements OrderCoreApi {
    public HttpResponse<OrderCoreDto> saveOrder() {
        return null;
    }
}