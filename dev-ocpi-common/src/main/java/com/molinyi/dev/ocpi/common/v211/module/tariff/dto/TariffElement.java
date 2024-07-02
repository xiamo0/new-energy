package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "费率明细")
public class TariffElement implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("price_components")
    @ApiModelProperty(value = "费率成分", required = true)
    private List<PriceComponent> priceComponents;

    @ApiModelProperty(value = "费率限制因素")
    private TariffRestrictions restrictions;

}
