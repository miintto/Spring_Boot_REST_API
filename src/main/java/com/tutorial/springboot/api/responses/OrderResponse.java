package com.tutorial.springboot.api.responses;

import com.tutorial.springboot.api.models.OrderInfo;
import com.tutorial.springboot.common.CommonResponse;
import lombok.Builder;

import java.util.List;

public class OrderResponse extends CommonResponse<OrderInfo> {

    @Builder
    public OrderResponse(final OrderInfo model, List<String> error, int status) {
        super(model);
        this.setError(error);
        this.setStatus(status);
    }
}
