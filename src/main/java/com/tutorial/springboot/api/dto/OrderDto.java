package com.tutorial.springboot.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@Setter
public class OrderDto {

    @NotNull(message = "orderCd cannot be null")
    private String orderCd;
    private String comments;

}
