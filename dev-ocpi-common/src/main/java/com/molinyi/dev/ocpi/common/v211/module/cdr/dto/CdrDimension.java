package com.molinyi.dev.ocpi.common.v211.module.cdr.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@ApiModel(description = "充电明细的种类")
public class CdrDimension implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "充电明细的种类", required = true)
    private CdrDimensionType type;

    @NonNull
    @ApiModelProperty(value = "充电明细的数值", required = true)
    private Float volume;

}
