package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Allowed {

    ALLOWED("ALLOWED"), BLOCKED("BLOCKED"), EXPIRED("EXPIRED"), NO_CREDIT("NO_CREDIT"), NOT_ALLOWED("NOT_ALLOWED");
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
