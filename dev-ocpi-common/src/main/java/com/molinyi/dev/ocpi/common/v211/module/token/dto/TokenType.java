package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenType {

    OTHER("OTHER"), RFID("RFID");

    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @EnumValue
    private final String value;
}
