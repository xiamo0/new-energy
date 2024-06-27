package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Reason {

    EmergencyStop("EmergencyStop"),
    EVDisconnected("EVDisconnected"),
    HardReset("HardReset"),
    Local("Local"),
    Other("Other"),
    PowerLoss("PowerLoss"),
    Reboot("Reboot"),
    SoftReset("SoftReset"),
    UnlockCommand("UnlockCommand"),
    DeAuthorized("DeAuthorized"),
    Remote("Remote");


    @JsonValue
    private final String value;

    @JsonCreator
    public static Reason fromValue(String value) {
        for (Reason c : Reason.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
