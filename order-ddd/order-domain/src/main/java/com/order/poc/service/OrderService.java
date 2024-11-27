package com.order.poc.service;

import com.order.poc.model.OrderModel;

/**
 * order domain service
 * **/
public interface OrderService {

    /**
     *  Save order interface
     *  @param order
     *  @return OrderModel
     * **/
    public OrderModel saveOrder(OrderModel order);
}
