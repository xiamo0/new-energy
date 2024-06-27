package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Location {

    Body("Body"),
    Cable("Cable"),
    EV("EV"),
    Inlet("Inlet"),
    Outlet("Outlet");

    @JsonValue
    private final String value;

    @JsonCreator
    public static Location fromValue(String value) {
        for (Location c : Location.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
