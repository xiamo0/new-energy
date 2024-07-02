package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PowerType {
    AC_1_PHASE("AC_1_PHASE"), AC_3_PHASE("AC_3_PHASE"), DC("DC");
    @EnumValue
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
