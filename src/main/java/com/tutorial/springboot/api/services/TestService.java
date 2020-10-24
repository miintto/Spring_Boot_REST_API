package com.tutorial.springboot.api.services;

import com.tutorial.springboot.api.dto.TestDto;
import com.tutorial.springboot.api.models.Test;
import com.tutorial.springboot.api.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repository;

    public Test run(final TestDto model) {
        long id = model.getId();

        return repository.findById(id).orElse(null);
    }

}

