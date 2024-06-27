package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConfigurationStatus {

    Accepted("Accepted"),
    Rejected("Rejected"),
    RebootRequired("RebootRequired"),
    NotSupported("NotSupported");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ConfigurationStatus fromValue(String value) {
        for (ConfigurationStatus c : ConfigurationStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
