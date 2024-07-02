package com.molinyi.dev.ocpi.common.v211.common.http;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ocpi 响应的结果，
 *
 * @param <T> 表示具体的业务数据
 */
@Data
@ApiModel(description = "ocpi响应信息")
public class OcpiResponse<T> {

    @ApiModelProperty(value = "状态码", example = "200")
    private Integer statusCode;

    @ApiModelProperty(value = "具体业务数据")
    private T data;

    @ApiModelProperty(value = "状态描述",example = "成功")
    private String statusMessage;

    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "时间")
    private Date timestamp;

    public OcpiResponse<T> success(T t) {
        final OcpiResponse<T> response = new OcpiResponse<>();
        response.setData(t);
        response.setTimestamp(new Date());
        response.setStatusCode(OcpIStatusCode.SUCCESS.getCode());
        response.setStatusMessage(OcpIStatusCode.SUCCESS.getDesc());
        return response;

    }

    public OcpiResponse<T> fail(OcpIStatusCode code) {
        final OcpiResponse<T> response = new OcpiResponse<>();

        response.setTimestamp(new Date());
        response.setStatusCode(code.getCode());
        response.setStatusMessage(code.getDesc());
        return response;
    }


}
