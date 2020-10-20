package com.tutorial.springboot.home;

import lombok.*;

/**
 * <pre>
 * :Description
 *     Model 관리
 * </pre>
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Home {
    private long id;
    private String contents;
}
