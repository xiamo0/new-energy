package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UpdateStatus {

    Accepted("Accepted"),
    Failed("Failed"),
    VersionMismatch("VersionMismatch"),
    NotSupported("NotSupported");


    @JsonValue
    private final String value;

    @JsonCreator
    public static UpdateStatus fromValue(String value) {
        for (UpdateStatus c : UpdateStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
