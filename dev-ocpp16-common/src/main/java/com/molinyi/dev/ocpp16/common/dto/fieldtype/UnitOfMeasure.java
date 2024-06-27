package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitOfMeasure {

    Wh("Wh"),
    varh("varh"),
    W("W"),
    kW("kW"),
    VA("VA"),
    kVA("kVA"),
    var("var"),
    kvar("kvar"),
    A("A"),
    Celsius("Celsius"),
    Fahrenheit("Fahrenheit"),
    K("K"),
    Percent("Percent"),
    V("V"),
    kvarh("kvarh");


    @JsonValue
    private final String value;

    @JsonCreator
    public static UnitOfMeasure fromValue(String value) {
        for (UnitOfMeasure c : UnitOfMeasure.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
