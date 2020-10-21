package com.tutorial.springboot.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Test {

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Info {
        private long id;
        private String contents;
    }

    @Getter
    @Setter
    public static class Request {
        private long id;
    }

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Response {
        private long id;
        private String contents;
    }

}