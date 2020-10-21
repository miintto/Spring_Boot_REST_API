package com.tutorial.springboot.api.responses;

import com.tutorial.springboot.api.models.Test;
import com.tutorial.springboot.common.CommonResponse;
import lombok.Builder;

public class TestResponse extends CommonResponse<Test.Response> {

    @Builder
    public TestResponse(final Test.Response model, String error, int status) {
        super(model);
        this.setError(error);
        this.setStatus(status);
    }
}
