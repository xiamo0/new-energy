package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingProfileKindType {

    Recurring("Recurring"),
    Absolute("Absolute"),
    Relative("Relative");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ChargingProfileKindType fromValue(String value) {
        for (ChargingProfileKindType c : ChargingProfileKindType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
