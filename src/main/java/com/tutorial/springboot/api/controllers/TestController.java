package com.tutorial.springboot.api.controllers;

import com.tutorial.springboot.api.models.Test;
import com.tutorial.springboot.api.responses.TestResponse;
import com.tutorial.springboot.api.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    @Autowired
    private TestService service;

    @PostMapping
    public TestResponse post(@RequestBody @Valid Test.Request requestModel, Errors errors) {
        if (errors.hasErrors()) {
            errors.getAllErrors();
            return TestResponse.builder()
                    .model(Test.Response.builder().build())
                    .error("error")
                    .status(500).build();
        }

        Test.Response model = null;
        String error = null;
        int status = 200;

        try {
            model = service.run(requestModel);
        } catch (final Exception e) {
            error = e.getMessage();
            status = 500;
        }

        return TestResponse.builder()
                   .model(model)
                   .error(error)
                   .status(status).build();
    }

}
