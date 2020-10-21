package com.tutorial.springboot.api.services;

import com.tutorial.springboot.api.models.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Test run(final Test model) {
        long id = model.getId();
        System.out.println(id);

        return Test.builder()
                   .id(id)
                   .contents("sample contents").build();
    }

}

