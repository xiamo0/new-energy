package com.molinyi.dev.ocpi.common.v211.module.version.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@ApiModel(description = "Version details")
public class VersionDetails {

    @NonNull
    @ApiModelProperty(value = "Version number", example = "2.1.1", required = true)
    private VersionNumber version;

    @NonNull
    @ApiModelProperty(value = "节点详情", required = true)
    private List<Endpoint> endpoints;


}
