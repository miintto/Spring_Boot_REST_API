package com.tutorial.springboot.api.controllers;

import com.tutorial.springboot.api.dto.TestDto;
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
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    @Autowired
    private TestService service;

    @PostMapping
    public TestResponse post(@RequestBody @Valid TestDto requestModel, Errors errors) {
        List<String> error = new ArrayList<>();
        Test model = Test.builder().id(0).contents(null).build();

        int status = 200;

        if (errors.hasErrors()) {
            errors.getAllErrors().forEach(e->{
                error.add(e.getDefaultMessage());
            });

            return TestResponse.builder()
                    .model(Test.builder().build())
                    .error(error)
                    .status(400).build();
        }

        try {
            model = service.run(requestModel);
        } catch (final Exception e) {
            error.add(e.getMessage());
            status = 400;
        }

        return TestResponse.builder()
                   .model(model)
                   .error(error)
                   .status(status).build();
    }

}
