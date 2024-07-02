package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.types.DisplayText;
import com.molinyi.dev.ocpi.common.v211.module.types.EnergyMix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "收费价格信息")
public class Tariff implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 36)
    @ApiModelProperty(value = "在cpo平台唯一标识", required = true, example = "12345")
    private String id;

    @NonNull
    @Size(max = 3)
    @ApiModelProperty(value = "币种", required = true, example = "EUR")
    private String currency;

    @NonNull
    @JsonProperty("tariff_alt_text")
    @ApiModelProperty(value = "价格描述")
    private List<DisplayText> tariffAltText;

    @NonNull
    @JsonProperty("tariff_alt_url")
    @Size(max = 255)
    @ApiModelProperty(value = "价格描述链接")
    private String tariffAltUrl;

    @NonNull
    @JsonProperty("elements")
    @ApiModelProperty(value = "收费元素")
    private List<TariffElement> elements;

    @JsonProperty("energy_mix")
    @ApiModelProperty(value = "能源类型")
    private EnergyMix energyMix;

    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", required = true)
    private Date lastUpdated;

}
