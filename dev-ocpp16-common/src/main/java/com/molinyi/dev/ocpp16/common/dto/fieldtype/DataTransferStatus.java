package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataTransferStatus {

    Accepted("Accepted"),
    Rejected("Rejected"),
    UnknownMessageId("UnknownMessageId"),
    UnknownVendorId("UnknownVendorId");

    @JsonValue
    private final String value;

    @JsonCreator
    public static DataTransferStatus fromValue(String value) {
        for (DataTransferStatus c : DataTransferStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
