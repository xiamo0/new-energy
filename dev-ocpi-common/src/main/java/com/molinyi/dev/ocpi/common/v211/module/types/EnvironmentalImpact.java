package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "环境影响明细")
public class EnvironmentalImpact implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "环境影响类型", required = true)
    private EnvironmentalImpactCategory category;

    @NonNull
    @ApiModelProperty(value = "环境影响值", required = true)
    private Float amount;
}
