package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AvailabilityStatus {

    Rejected("Rejected"),
    Scheduled("Scheduled");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AvailabilityStatus fromString(String value) {
        for (AvailabilityStatus status : AvailabilityStatus.values()) {
            if (status.getValue().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid availability status: " + value);
    }


}
