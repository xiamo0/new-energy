package com.molinyi.dev.ocpi.common.v211.module.version.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum VersionNumber {

    V_2_1_1("2.1.1"), V_2_1("2.1"), V_2("2.0");

    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @EnumValue
    private final String value;

    @Override
    public String toString() {
        return value;
    }

    public static VersionNumber get(@NonNull String value) {
        return Arrays.stream(VersionNumber.values()).filter(e -> {
            return e.getValue().equals(value);
        }).findFirst().orElse(null);

    }
//    @JsonCreator
//    public static VersionNumber fromVersionNumber(String ersionNumberValue) {
//        for (VersionNumber s : VersionNumber.values()) {
//            if (s.getValue().equals(ersionNumberValue)) {
//                return s;
//            }
//        }
//        throw new IllegalArgumentException("Invalid VersionNumber: " + ersionNumberValue);
//    }
}
