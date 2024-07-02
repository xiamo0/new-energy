package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ParkingRestriction {

    EV_ONLY("EV_ONLY"), PLUGGED("PLUGGED"), DISABLED("DISABLED"), CUSTOMERS("CUSTOMERS"), MOTORCYCLES("MOTORCYCLES");

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
