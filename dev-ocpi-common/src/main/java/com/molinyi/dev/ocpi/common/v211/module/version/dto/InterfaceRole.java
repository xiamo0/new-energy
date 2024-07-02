package com.molinyi.dev.ocpi.common.v211.module.version.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterfaceRole {
    SENDER("SENDER"),
    RECEIVER("RECEIVER");
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
