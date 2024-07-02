package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import com.molinyi.dev.ocpi.common.v211.module.token.dto.Token;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ApiModel(value = "发起充电指令")
public class StartSession implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "回调地址", required = true)
    private String responseUrl;

    @ApiModelProperty(value = "凭证信息", required = true)
    private Token token;

    @ApiModelProperty(value = "充电站ID", required = true)
    private String locationId;

    @ApiModelProperty(value = "设备ip", required = true)
    private String evseUid;

    //gireve 自定义的
    @ApiModelProperty(value = "授权ID")
    private String authorizationId;


}
