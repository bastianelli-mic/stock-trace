package io.github.bastianelli.mic.stocktrace.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HealthResponse {

    private String status;

    public HealthResponse() {
        this.status = "UP";
    }
}
