package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnlockStatus {

    UNLOCKED("Unlocked"),
    UNLOCK_FAILED("UnlockFailed"),
    NOT_SUPPORTED("NotSupported");


    @JsonValue
    private final String value;

    @JsonCreator
    public static UnlockStatus fromValue(String value) {
        for (UnlockStatus c : UnlockStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
