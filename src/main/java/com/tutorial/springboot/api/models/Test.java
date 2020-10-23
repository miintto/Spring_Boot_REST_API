package com.tutorial.springboot.api.models;

import lombok.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Test {

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Info {
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