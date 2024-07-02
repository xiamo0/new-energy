package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommandType {

    RESERVE_NOW("RESERVE_NOW"), START_SESSION("START_SESSION"), STOP_SESSION("STOP_SESSION"), UNLOCK_CONNECTOR("UNLOCK_CONNECTOR");
    private final String value;
}
