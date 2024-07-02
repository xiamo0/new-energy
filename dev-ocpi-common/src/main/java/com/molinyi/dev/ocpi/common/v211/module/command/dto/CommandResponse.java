package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ApiModel(description = "命令响应明细")
public class CommandResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "命令响应结果", required = true)
    private CommandResponseType result;

}
