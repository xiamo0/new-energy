package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClearCacheStatus {

    Accepted("Accepted"),
    Rejected("Rejected");

    @JsonValue
    private final String value;

    @JsonCreator
    public static ClearCacheStatus fromValue(String value) {
        for (ClearCacheStatus c : ClearCacheStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
