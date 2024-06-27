package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargingProfilePurpose {

    CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
    TX_DEFAULT_PROFILE("TxDefaultProfile"),
    TX_PROFILE("TxProfile");

    @JsonValue
    private final String value;

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static ChargingProfilePurpose create(String value) {
        for (ChargingProfilePurpose e : ChargingProfilePurpose.values()) {
            if (e.value.equals((value))) {
                return e;
            }
        }
        throw new IllegalArgumentException("No element matches " + value);
    }
}