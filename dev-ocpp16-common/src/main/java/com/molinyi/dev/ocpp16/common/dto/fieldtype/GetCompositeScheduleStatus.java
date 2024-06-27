package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GetCompositeScheduleStatus {

    Accepted("Accepted"),
    Rejected("Rejected");

    @JsonValue
    private final String value;

    @JsonCreator
    public static GetCompositeScheduleStatus fromValue(String value) {
        for (GetCompositeScheduleStatus c : GetCompositeScheduleStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
