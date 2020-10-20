package com.tutorial.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 @SpringBootApplication
 기존 Spring 의 @Configuration, @EnableAutoConfiguration, @EnableWebMvc, @ComponentScan 를 포함
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
