package com.order.poc.api;

import com.order.poc.dto.OrderCoreDto;

import java.net.http.HttpResponse;

public interface OrderCoreApi {

    public HttpResponse<OrderCoreDto> saveOrder();
}
