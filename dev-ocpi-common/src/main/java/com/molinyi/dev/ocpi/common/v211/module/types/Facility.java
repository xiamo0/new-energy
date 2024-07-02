package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@AllArgsConstructor
@NoArgsConstructor(force = true)
public enum Facility {
    HOTEL("HOTEL"),
    RESTAURANT("RESTAURANT"),
    CAFE("CAFE"),
    MALL("MALL"),
    SUPERMARKET("SUPERMARKET"),
    SPORT("SPORT"),
    RECREATION_AREA("RECREATION_AREA"),
    NATURE("NATURE"),
    MUSEUM("MUSEUM"),
    BIKE_SHARING("BIKE_SHARING"),
    BUS_STOP("BUS_STOP"),
    TAXI_STAND("TAXI_STAND"),
    TRAM_STOP("TRAM_STOP"),
    METRO_STATION("METRO_STATION"),
    TRAIN_STATION("TRAIN_STATION"),
    AIRPORT("AIRPORT"),
    PARKING_LOT("PARKING_LOT"),
    CARPOOL_PARKING("CARPOOL_PARKING"),
    FUEL_STATION("FUEL_STATION"),
    WIFI("WIFI");

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String value;

}
