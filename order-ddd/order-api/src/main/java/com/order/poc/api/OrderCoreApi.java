package com.order.poc.api;

import com.order.poc.dto.OrderCoreDto;
import java.net.http.HttpResponse;

/**
 * order API
 * client can use the java jar directly and use object easily
 * **/
public interface OrderCoreApi {

    /**
     * Save order API
     *  @param orderCoreDto
     *  @return OrderCoreDto
     * **/
    public HttpResponse<OrderCoreDto> saveOrder(OrderCoreDto orderCoreDto);
}
