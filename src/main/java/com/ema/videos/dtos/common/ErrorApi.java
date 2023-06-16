package com.ema.videos.dtos.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorApi {
    private String timestamp;
    private Integer status;
    private String error;
    private String message;
}
