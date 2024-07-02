package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum EnvironmentalImpactCategory {

    NUCLEAR_WASTE("NUCLEAR_WASTE"), CARBON_DIOXIDE("CARBON_DIOXIDE");
    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
