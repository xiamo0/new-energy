package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TriggerMessageStatus {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NotImplemented("NotImplemented");


    @JsonValue
    private final String value;

    @JsonCreator
    public static TriggerMessageStatus fromValue(String value) {
        for (TriggerMessageStatus c : TriggerMessageStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
