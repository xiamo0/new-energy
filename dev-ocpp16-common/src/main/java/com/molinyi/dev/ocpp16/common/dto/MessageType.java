package com.molinyi.dev.ocpp16.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    CALL(2),
    CALL_RESULT(3),
    CALL_ERROR(4);

    private final Integer value;

}
