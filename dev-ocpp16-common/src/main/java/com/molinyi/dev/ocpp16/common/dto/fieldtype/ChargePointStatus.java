package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargePointStatus {

    Available("Available"),
    Preparing("Preparing"),
    Charging("Charging"),
    SuspendedEVSE("SuspendedEVSE"),
    SuspendedEV("SuspendedEV"),
    Finishing("Finishing"),
    Unavailable("Unavailable"),
    Faulted("Faulted"),
    Reserved("Reserved");

    private final String value;

    @JsonCreator
    public static ChargePointStatus fromValue(String value) {
        for (ChargePointStatus status : ChargePointStatus.values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @JsonValue
    public String toValue() {
        return value;
    }


}
