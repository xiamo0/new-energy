package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConnectorType {

    CHADEMO("CHADEMO"),
    DOMESTIC_ADOMESTIC_B("DOMESTIC_ADOMESTIC_B"),
    DOMESTIC_F("DOMESTIC_F"),
    DOMESTICJ("DOMESTICJ"),
    IEC_62196_T1("IEC_62196_T1"),
    COMBOIEC_62196_T2("COMBOIEC_62196_T2"),

    DOMESTIC_A("DOMESTIC_A"),
    DOMESTIC_B("DOMESTIC_B"),
    DOMESTIC_C("DOMESTIC_C"),
    DOMESTIC_D("DOMESTIC_D"),
    DOMESTIC_E("DOMESTIC_E"),

    DOMESTIC_G("DOMESTIC_G"),
    DOMESTIC_H("DOMESTIC_H"),
    DOMESTIC_I("DOMESTIC_I"),
    DOMESTIC_J("DOMESTIC_J"),
    DOMESTIC_K("DOMESTIC_K"),
    DOMESTIC_L("DOMESTIC_L"),
    DOMESTIC_M("DOMESTIC_M"),
    DOMESTIC_N("DOMESTIC_N"),
    DOMESTIC_O("DOMESTIC_O"),
    GBT_AC("GBT_AC"),
    GBT_DC("GBT_DC"),
    IEC_60309_2_SINGLE_16("IEC_60309_2_single_16"),
    IEC_60309_2_THREE_16("IEC_60309_2_three_16"),
    IEC_60309_2_THREE_32("IEC_60309_2_three_32"),
    IEC_60309_2_THREE_64("IEC_60309_2_three_64"),
    IEC_62196_T1_COMBO("IEC_62196_T1_COMBO"),
    IEC_62196_T2("IEC_62196_T2"),
    IEC_62196_T2_COMBO("IEC_62196_T2_COMBO"),
    IEC_62196_T3A("IEC_62196_T3A"),
    IEC_62196_T3C("IEC_62196_T3C"),
    NEMA_5_20("NEMA_5_20"),
    NEMA_6_30("NEMA_6_30"),
    NEMA_6_50("NEMA_6_50"),
    NEMA_10_30("NEMA_10_30"),
    NEMA_10_50("NEMA_10_50"),
    NEMA_14_30("NEMA_14_30"),
    NEMA_14_50("NEMA_14_50"),
    PANTOGRAPH_BOTTOM_U("PANTOGRAPH_BOTTOM_U"),
    PANTOGRAPH_TOP_DOWN("PANTOGRAPH_TOP_DOWN"),
    TESLA_R("TESLA_R"),
    TESLA_S("TESLA_S");

    @EnumValue
    @JsonValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
