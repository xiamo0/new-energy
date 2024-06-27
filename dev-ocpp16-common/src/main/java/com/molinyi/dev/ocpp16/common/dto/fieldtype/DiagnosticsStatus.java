package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiagnosticsStatus {

    Idle("Idle"),
    Uploaded("Uploaded"),
    UploadFailed("UploadFailed"),
    Uploading("Uploading");

    @JsonValue
    private final String value;

    @JsonCreator
    public static DiagnosticsStatus fromValue(String value) {
        for (DiagnosticsStatus c : DiagnosticsStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
