package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TariffDimensionType {
    ENERGY("ENERGY"),
    FLAT("FLAT"),
    PARKING_TIME("PARKING_TIME"),
    TIME("TIME"),
    SESSION_TIME("SESSION_TIME");

    private final String value;
}
