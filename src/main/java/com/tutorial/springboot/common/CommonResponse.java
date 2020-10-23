package com.tutorial.springboot.common;

import lombok.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class CommonResponse<T> {
    @NonNull private T data;
    private List<String> error;
    private int status;
}
