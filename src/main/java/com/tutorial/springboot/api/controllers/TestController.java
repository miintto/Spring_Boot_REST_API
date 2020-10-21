package com.tutorial.springboot.api.controllers;

import com.tutorial.springboot.api.models.Test;
import com.tutorial.springboot.api.responses.TestResponse;
import com.tutorial.springboot.api.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    @Autowired
    private TestService service;

    @PostMapping
    public @ResponseBody TestResponse post(@RequestBody Test.Request requestModel) {
        Test.Response model = null;
        String error = null;
        int status   = 200;

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
