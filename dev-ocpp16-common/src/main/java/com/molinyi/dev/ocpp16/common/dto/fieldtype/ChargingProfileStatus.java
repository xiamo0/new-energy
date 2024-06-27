package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingProfileStatus {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NotSupported("NotSupported");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ChargingProfileStatus fromValue(String value) {
        for (ChargingProfileStatus c : ChargingProfileStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
