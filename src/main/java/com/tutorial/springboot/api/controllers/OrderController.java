package com.tutorial.springboot.api.controllers;

import com.tutorial.springboot.api.dto.OrderDto;
import com.tutorial.springboot.api.models.OrderInfo;
import com.tutorial.springboot.api.responses.OrderResponse;
import com.tutorial.springboot.api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping
    public OrderResponse post(@RequestBody @Valid OrderDto requestModel, Errors errors) {
        List<String> error = new ArrayList<>();
        OrderInfo model = null;
        int status = 200;

        if (errors.hasErrors()) {
            errors.getAllErrors().forEach(e->{
                error.add(e.getDefaultMessage());
            });

            return OrderResponse.builder()
                    .model(OrderInfo.builder().build())
                    .error(error)
                    .status(400).build();
        }

        try {
            model = service.run(requestModel);
        } catch (final Exception e) {
            error.add(e.getMessage());
            status = 400;
        }

        return OrderResponse.builder()
                .model(model)
                .error(error)
                .status(status).build();
    }

}
