package com.tutorial.springboot.api.models;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Test {
    private long id;
    private String contents;
}