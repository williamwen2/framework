package com.order.poc.service.impl;

import com.order.poc.db.repository.OrderRepository;
import com.order.poc.model.OrderModel;
import com.order.poc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * order infra operation, communicate with DB/Cache/API/MQ
 *
 * **/
@Service
public class OrderServicevImpl implements OrderService {

   @Autowired
   private OrderRepository orderRepository;

    public OrderModel saveOrder(OrderModel order) {
        //orderRepository.save(order);
        return null;
    }
}
