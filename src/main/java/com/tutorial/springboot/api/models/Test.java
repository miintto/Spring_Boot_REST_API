package com.tutorial.springboot.api.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Test {

    @Entity
    @Table(name="test")
    @Getter
    @AllArgsConstructor
    @Builder
    public static class Info {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String contents;
        private LocalDate startDate;
        private LocalDate endDate;
    }

    @Getter
    @NoArgsConstructor
    @Setter
    public static class Request {
        @NotNull(message = "id cannot be null")
        private long id;
        @NotNull(message = "startDate cannot be null")
        private LocalDate startDate;
        @NotNull(message = "endDate cannot be null")
        private LocalDate endDate;
    }

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Response {
        private long id;
        private String contents;
    }

}