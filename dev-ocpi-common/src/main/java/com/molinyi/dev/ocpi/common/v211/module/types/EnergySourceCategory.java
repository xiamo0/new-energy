package com.molinyi.dev.ocpi.common.v211.module.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnergySourceCategory {

    NUCLEAR("NUCLEAR"), GENERAL_FOSSIL("GENERAL_FOSSIL"), COAL("COAL"), GAS("GAS"), GENERAL_GREEN("GENERAL_GREEN"), SOLAR("SOLAR"), WIND("WIND"), WATER("WATER");

    private final String value;
}
