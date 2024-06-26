package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthorizationStatus {

    Accepted("Accepted"),
    Blocked("Blocked"),
    Expired("Expired"),
    Invalid("Invalid"),
    ConcurrentTx("ConcurrentTx");
    private final String value;


    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AuthorizationStatus fromString(String value) {
        for (AuthorizationStatus s : values()) {
            if (s.getValue().equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid AuthorizationStatus: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
