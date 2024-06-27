package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageTrigger {

    BootNotification("BootNotification"),
    DiagnosticsStatusNotification("DiagnosticsStatusNotification"),
    FirmwareStatusNotification("FirmwareStatusNotification"),
    Heartbeat("Heartbeat"),
    StatusNotification("StatusNotification"),
    MeterValues("MeterValues");

    @JsonValue
    private final String value;

    @JsonCreator
    public static MessageTrigger fromValue(String value) {
        for (MessageTrigger c : MessageTrigger.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
