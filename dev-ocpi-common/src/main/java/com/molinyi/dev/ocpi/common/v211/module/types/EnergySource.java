package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "能源明细")
public class EnergySource implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "能源类型", required = true)
    private EnergySourceCategory source;

    @NonNull
    @Max(100)
    @Min(1)
    @ApiModelProperty(value = "能源百分比", required = true)
    private int percentage;

}
