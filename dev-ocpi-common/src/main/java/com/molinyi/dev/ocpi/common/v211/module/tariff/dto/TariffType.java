package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TariffType {

    AD_HOC_PAYMENT("AD_HOC_PAYMENT"),
    PROFILE_CHEAP("PROFILE_CHEAP"),
    PROFILE_FAST("PROFILE_FAST"),
    PROFILE_GREEN("PROFILE_GREEN"),
    REGULAR("REGULAR");

    private final String value;

}
