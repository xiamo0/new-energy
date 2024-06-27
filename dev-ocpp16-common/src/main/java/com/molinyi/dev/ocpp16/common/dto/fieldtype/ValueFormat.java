package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ValueFormat {

    Raw("Raw"),
    SignedData("SignedData");


    @JsonValue
    private final String value;

    @JsonCreator
    public static ValueFormat fromValue(String value) {
        for (ValueFormat c : ValueFormat.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
