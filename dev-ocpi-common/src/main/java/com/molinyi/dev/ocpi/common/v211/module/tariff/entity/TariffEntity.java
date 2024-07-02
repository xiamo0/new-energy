package com.molinyi.dev.ocpi.common.v211.module.tariff.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import com.molinyi.dev.ocpi.common.v211.module.tariff.dto.TariffElement;
import com.molinyi.dev.ocpi.common.v211.module.types.DisplayText;
import com.molinyi.dev.ocpi.common.v211.module.types.EnergyMix;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_v211_tariff")
public class TariffEntity extends BaseEntity {

    @TableId
    private String id;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private String currency;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    @JsonProperty("tariff_alt_text")
    private List<DisplayText> tariffAltText;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    @JsonProperty("tariff_alt_url")
    private String tariffAltUrl;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private List<TariffElement> elements;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    @JsonProperty("energy_mix")
    private EnergyMix energyMix;

}
