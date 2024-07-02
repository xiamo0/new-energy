package com.molinyi.dev.ocpi.common.v211.module.cdr.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CdrDimensionType {
    ENERGY("ENERGY"), FLAT("FLAT"), MAX_CURRENT("MAX_CURRENT"), MIN_CURRENT("MIN_CURRENT"), PARKING_TIME("PARKING_TIME"), TIME("TIME");

    private final String value;
}
