package com.molinyi.dev.ocpi.common.v211.module.version.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@ApiModel(description = "节点信息")
public class Endpoint {

    @NonNull
    @ApiModelProperty(value = "节点类型", required = true)
    private ModuleID identifier;

    @NonNull
    @Size(max = 255)
    @ApiModelProperty(value = "节点url", required = true)
    private String url;

}
