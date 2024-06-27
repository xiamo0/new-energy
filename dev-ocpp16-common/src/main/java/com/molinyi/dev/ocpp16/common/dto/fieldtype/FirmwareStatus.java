package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FirmwareStatus {

    Downloaded("Downloaded"),
    DownloadFailed("DownloadFailed"),
    Downloading("Downloading"),
    Idle("Idle"),
    InstallationFailed("InstallationFailed"),
    Installing("Installing"),
    Installed("Installed");

    @JsonValue
    private final String value;

    @JsonCreator
    public static FirmwareStatus fromValue(String value) {
        for (FirmwareStatus c : FirmwareStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
