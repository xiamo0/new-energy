package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ApiModel(value = "结束充电指令")
public class StopSession implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("response_url")
    @ApiModelProperty(value = "回调地址", required = true)
    private String responseUrl;

    @NonNull
    @Size(max = 36)
    @JsonProperty("session_id")
    @ApiModelProperty(value = "会话ID", required = true)
    private String sessionId;

}
