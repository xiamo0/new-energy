package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RegistrationStatus {

    Accepted("Accepted"),
    Pending("Pending"),
    Rejected("Rejected");

    private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static RegistrationStatus fromString(String value) {
        for (RegistrationStatus s : values()) {
            if (s.getValue().equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid status: " + value);
    }
}
