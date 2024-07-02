package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "能源成分明细")
public class EnergyMix {

    @NonNull
    @JsonProperty("is_green_energy")
    @ApiModelProperty(value = "是否绿色能源", required = true)
    private Boolean isGreenEnergy;

    @JsonProperty("energy_sources")
    @ApiModelProperty(value = "能源成分")
    private List<EnergySource> energySources;

    @JsonProperty("environ_impact")
    @ApiModelProperty(value = "环境影响明细")
    private List<EnvironmentalImpact> environImpact;

    @JsonProperty("supplier_name")
    @Size(max = 64)
    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    @JsonProperty("energy_product_name")
    @Size(max = 64)
    @ApiModelProperty(value = "能源产品名称")
    private String energyProductName;

}
