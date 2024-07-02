package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "价格成分明细")
public class PriceComponent implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "价格成分类型", required = true)
    private TariffDimensionType type;

    @NonNull
    @ApiModelProperty(value = "价格", required = true)
    private Float price;

    @NonNull
    @JsonProperty("step_size")
    @ApiModelProperty(value = "最小收费单位", required = true)
    private Integer stepSize;

}
