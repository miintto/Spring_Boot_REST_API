package com.tutorial.springboot.api.services;

import com.tutorial.springboot.api.dto.OrderDto;
import com.tutorial.springboot.api.models.OrderInfo;
import com.tutorial.springboot.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public OrderInfo run(final OrderDto model) {
        String orderCd = model.getOrderCd();

        return repository.findById(orderCd).orElse(null);
    }

}

