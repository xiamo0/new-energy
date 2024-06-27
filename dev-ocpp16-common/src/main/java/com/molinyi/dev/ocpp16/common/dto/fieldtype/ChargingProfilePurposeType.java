package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingProfilePurposeType {

    ChargePointMaxProfile("ChargePointMaxProfile"),
    TxDefaultProfile("TxDefaultProfile"),
    TxProfile("TxProfile");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ChargingProfilePurposeType fromValue(String value) {
        for (ChargingProfilePurposeType c : ChargingProfilePurposeType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
