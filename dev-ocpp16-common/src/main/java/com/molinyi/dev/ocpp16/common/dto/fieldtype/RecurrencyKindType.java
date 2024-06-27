package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecurrencyKindType {

    Daily("Daily"),
    Weekly("Weekly");


    @JsonValue
    private final String value;

    @JsonCreator
    public static RecurrencyKindType fromValue(String value) {
        for (RecurrencyKindType c : RecurrencyKindType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
