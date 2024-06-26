package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AvailabilityType {

    Inoperative("Inoperative"),
    Operative("Operative");
    private final String value;

    @JsonCreator
    public static AvailabilityType fromString(String value) {
        for (AvailabilityType status : AvailabilityType.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid availability type: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
