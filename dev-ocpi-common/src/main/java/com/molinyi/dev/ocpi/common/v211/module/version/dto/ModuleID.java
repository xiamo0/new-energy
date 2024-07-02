package com.molinyi.dev.ocpi.common.v211.module.version.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum  ModuleID {

    CDRS("CDRS"), COMMANDS("Commands"), CREDENTIALS("Credentials"), Locations("Locations"), SESSIONS("Sessions"), TARIFFS("tariffs"), TOKENS("tokens");

    public static ModuleID get(String value) {
        return Arrays.stream(ModuleID.values()).filter(e -> {
            return e.getValue().equals(value);
        }).findFirst().orElse(null);

    }

    @Override
    public String toString() {
        return value;
    }
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @EnumValue
    private final String value;
}
