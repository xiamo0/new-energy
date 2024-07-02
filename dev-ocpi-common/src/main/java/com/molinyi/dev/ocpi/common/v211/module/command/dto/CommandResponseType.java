package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommandResponseType {

    NOT_SUPPORTED("NOT_SUPPORTED"), REJECTED("REJECTED"), ACCEPTED("ACCEPTED"), TIMEOUT("TIMEOUT"), UNKNOWN_SESSION("UNKNOWN_SESSION");

    private final String value;
}
