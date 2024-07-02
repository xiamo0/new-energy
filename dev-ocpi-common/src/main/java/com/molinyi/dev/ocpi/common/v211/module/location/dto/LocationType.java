package com.molinyi.dev.ocpi.common.v211.module.location.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@ApiModel(description="位置类型")
public enum LocationType {
    ON_STREET("ON STREET"),
    PARKING_GARAGE("PARKING_GARAGE"),
    UNDERGROUND_GARAGEPARKING("UNDERGROUND_GARAGEPARKING"),
    PARKING_LOT("PARKING_LOT"),
    OTHER("OTHER"),
    UNKNOWN("UNKNOWN");

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String val;
}
