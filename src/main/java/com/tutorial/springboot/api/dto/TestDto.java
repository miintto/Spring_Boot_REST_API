package com.tutorial.springboot.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@Setter
public class TestDto {

    @NotNull(message = "id cannot be null")
    private long id;

}