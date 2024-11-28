package com.order.poc.domain.ability;

import com.order.poc.domain.ability.service.OrderAdvancedService;
import com.order.poc.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *    implement order advanced service
 *  * combine basic domain service
 * **/
@Service
public class OrderAbility implements OrderAdvancedService {

    @Autowired
    private OrderService orderBasicService;
}
