package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DayOfWeek {

    MONDAY("MONDAY"), TUESDAY("TUESDAY"), WEDNESDAY("WEDNESDAY"), THURSDAY("THURSDAY"), FRIDAY("FRIDAY"), SATURDAY("SATURDAY"), SUNDAY("SUNDAY");
    private final String value;

}
