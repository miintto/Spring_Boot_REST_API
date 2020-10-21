package com.tutorial.springboot.api.services;

import com.tutorial.springboot.api.models.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Test.Response run(final Test.Request model) {
        long id = model.getId();

        return Test.Response.builder()
                   .id(id)
                   .contents("sample contents").build();
    }

}

