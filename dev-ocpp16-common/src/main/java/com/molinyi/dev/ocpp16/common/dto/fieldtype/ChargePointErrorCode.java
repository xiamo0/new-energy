package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChargePointErrorCode {

    ConnectorLockFailure("ConnectorLockFailure"),
    EVCommunicationError("EVCommunicationError"),
    GroundFailure("GroundFailure"),
    HighTemperature("HighTemperature"),
    InternalError("InternalError"),
    LocalListConflict("LocalListConflict"),
    NoError("NoError"),
    OtherError("OtherError"),
    OverCurrentFailure("OverCurrentFailure"),
    OverVoltage("OverVoltage"),
    PowerMeterFailure("PowerMeterFailure"),
    PowerSwitchFailure("PowerSwitchFailure"),
    ReaderFailure("ReaderFailure"),
    ResetFailure("ResetFailure"),
    UnderVoltage("UnderVoltage"),
    WeakSignal("WeakSignal");

    private final String value;

    @JsonCreator
    public static ChargePointErrorCode fromValue(String value) {
        for (ChargePointErrorCode chargePointErrorCode : ChargePointErrorCode.values()) {
            if (chargePointErrorCode.value.equals(value)) {
                return chargePointErrorCode;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @JsonValue
    public String toValue() {
        return value;
    }

}
