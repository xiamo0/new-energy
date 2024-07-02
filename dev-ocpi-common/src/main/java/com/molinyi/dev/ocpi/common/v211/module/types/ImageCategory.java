package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ImageCategory {

    CHARGER("CHARGER"), ENTRANCE("ENTRANCE"), LOCATION("LOCATION"), OPERATOR("OPERATOR"), OTHER("OTHER"), OWNER("OWNER");


    public static ImageCategory get(@NonNull String value) {

        return Arrays.stream(ImageCategory.values()).filter(e -> {
            return e.getValue().equals(value);
        }).findFirst().orElse(null);
    }

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
