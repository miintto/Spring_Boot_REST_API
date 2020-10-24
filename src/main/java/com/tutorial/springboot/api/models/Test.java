package com.tutorial.springboot.api.models;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="test")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String contents;
    private LocalDate startDate;
    private LocalDate endDate;

}