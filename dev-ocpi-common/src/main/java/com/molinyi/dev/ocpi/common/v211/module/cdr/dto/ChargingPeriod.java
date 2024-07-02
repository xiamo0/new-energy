package com.molinyi.dev.ocpi.common.v211.module.cdr.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "充电阶段")
public class ChargingPeriod implements Serializable {

    private static final long serialVersionUID = 1L;


    @NonNull
    @JsonProperty("start_date_time")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "开始时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date startDateTime;
    @NonNull
    @ApiModelProperty(value = "充电明细类型列表")
    private List<CdrDimension> dimensions;

    @JsonProperty("tariff_id")
    @ApiModelProperty(value = "计费ID", required = true, example = "1234567890")
    private String tariffId;
}
