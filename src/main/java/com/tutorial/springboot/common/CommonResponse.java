package com.tutorial.springboot.common;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class CommonResponse<T> {
    @NonNull private T data;
    private String error;
    private int status;
}
