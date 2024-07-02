package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public enum Capability {
    CHARGING_PROFILE_CAPABLE("CHARGING_PROFILE_CAPABLE"), CHARGING_PREFERENCES_CAPABLE("CHARGING_PREFERENCES_CAPABLE"), CHIP_CARD_SUPPORT("CHIP_CARD_SUPPORT"), CONTACTLESS_CARD_SUPPORT("CONTACTLESS_CARD_SUPPORT"), CREDIT_CARD_PAYABLE("CREDIT_CARD_PAYABLE"), DEBIT_CARD_PAYABLE("DEBIT_CARD_PAYABLE"), PED_TERMINAL("PED_TERMINAL"), REMOTE_START_STOP_CAPABLE("REMOTE_START_STOP_CAPABLE"), RESERVABLE("RESERVABLE"), RFID_READER("RFID_READER"), START_SESSION_CONNECTOR_REQUIRED("START_SESSION_CONNECTOR_REQUIRED"), TOKEN_GROUP_CAPABLE("TOKEN_GROUP_CAPABLE"), UNLOCK_CAPABLE("UNLOCK_CAPABLE");
    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String value;


}
