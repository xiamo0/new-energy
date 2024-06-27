package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingRateUnitEnum {
    A("A"),
    W("W");

    @JsonValue
    private final String value;

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static ChargingRateUnitEnum create(String value) {
        for (ChargingRateUnitEnum e : ChargingRateUnitEnum.values()) {
            if (e.value.equals((value))) {
                return e;
            }
        }
        throw new IllegalArgumentException("No element matches " + value);
    }
}
