package com.tutorial.springboot.api.responses;

import com.tutorial.springboot.api.models.Test;
import com.tutorial.springboot.common.CommonResponse;
import lombok.Builder;
import java.util.List;

public class TestResponse extends CommonResponse<Test> {

    @Builder
    public TestResponse(final Test model, List<String> error, int status) {
        super(model);
        this.setError(error);
        this.setStatus(status);
    }
}
