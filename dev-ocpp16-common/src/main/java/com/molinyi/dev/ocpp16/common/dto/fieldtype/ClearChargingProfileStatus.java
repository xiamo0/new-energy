package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClearChargingProfileStatus {

    Accepted("Accepted"),
    Unknown("Unknown");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ClearChargingProfileStatus fromValue(String value) {
        for (ClearChargingProfileStatus c : ClearChargingProfileStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
