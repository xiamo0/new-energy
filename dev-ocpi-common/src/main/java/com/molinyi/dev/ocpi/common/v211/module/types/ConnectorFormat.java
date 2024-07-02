package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConnectorFormat {
    SOCKET("SOCKET"),
    CABLE("CABLE");

    @EnumValue
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String value;
}
