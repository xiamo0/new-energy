package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CancelReservationStatus {

    Accepted("Accepted"),
    Rejected("Rejected");

    private final String value;

    @JsonCreator
    public static CancelReservationStatus fromValue(String value) {
        for (CancelReservationStatus cancelReservationStatus : CancelReservationStatus.values()) {
            if (cancelReservationStatus.value.equals(value)) ;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
