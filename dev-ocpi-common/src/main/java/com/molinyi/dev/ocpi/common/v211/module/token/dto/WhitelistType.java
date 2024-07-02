package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WhitelistType {

    ALWAYS("ALWAYS"), ALLOWED("ALLOWED"), ALLOWED_OFFLINE("ALLOWED_OFFLINE"), NEVER("NEVER");
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @EnumValue
    private final String value;
}
