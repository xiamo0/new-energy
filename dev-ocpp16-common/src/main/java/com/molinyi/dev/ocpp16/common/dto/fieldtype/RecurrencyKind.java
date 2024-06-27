package com.molinyi.dev.ocpp16.common.dto.fieldtype;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecurrencyKind {

    DAILY("Daily"),
    WEEKLY("Weekly");

    @JsonValue
    private final String value;

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static RecurrencyKind create(String value) {
        for (RecurrencyKind e : RecurrencyKind.values()) {
            if (e.value.equals((value))) {
                return e;
            }
        }
        throw new IllegalArgumentException("No element matches " + value);
    }
}