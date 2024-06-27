package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingProfileKind {

    ABSOLUTE("Absolute"),
    RECURRING("Recurring"),
    RELATIVE("Relative");


    @JsonValue
    private final String value;

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static ChargingProfileKind create(String value) {
        for (ChargingProfileKind e : ChargingProfileKind.values()) {
            if (e.value.equals((value))) {
                return e;
            }
        }
        throw new IllegalArgumentException("No element matches " + value);
    }
}