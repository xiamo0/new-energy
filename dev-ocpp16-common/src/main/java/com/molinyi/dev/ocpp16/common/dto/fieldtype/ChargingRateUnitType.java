package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingRateUnitType {

    W("W"),
    A("A");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ChargingRateUnitType fromValue(String value) {
        for (ChargingRateUnitType c : ChargingRateUnitType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
