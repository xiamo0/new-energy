package com.molinyi.dev.ocpi.common.v211.module.cdr.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@ApiModel(description = "认证方法")
public enum AuthMethod {

    @ApiModelProperty(value = "白名单认证")
    WHITELIST("WHITELIST"),
    @ApiModelProperty(value = "认证请求")
    AUTH_REQUEST("AUTH_REQUEST");


    private final String value;
}
