package com.tutorial.springboot.home;

import org.springframework.stereotype.Service;

/**
 * <pre>
 * :Description
 *     비즈니스 로직 처리
 * </pre>
 */
@Service
public class HomeService {

    public Home get(final long id) {
        return Home.builder()
                .contents("sample contents").build();
    }

}
