package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import com.molinyi.dev.ocpi.common.v211.module.types.DisplayText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
@ApiModel(description = "授权明细")
public class AuthorizationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "授权状态", required = true)
    private Allowed allowed;

    @ApiModelProperty(value = "授权位置")
    private LocationReferences location;

    @ApiModelProperty(value = "授权信息")
    private DisplayText info;

    @ApiModelProperty(value = "授权ID", required = true)
    private String authorizationId;


}
