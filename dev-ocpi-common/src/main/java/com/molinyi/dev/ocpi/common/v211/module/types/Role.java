package com.molinyi.dev.ocpi.common.v211.module.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    CPO("CPO"), EMSP("EMSP"), HUB("HUB"), NAP("NAP"), NSP("NSP"), OTHER("OTHER"), SCSP("SCSP");
    private final String value;


}
