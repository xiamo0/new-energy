package com.molinyi.dev.ocpi.common.v211.module.types;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "充电设备未来状态时段")
public class StatusSchedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("period_begin")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "开始时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date periodBegin;

    @JsonProperty("period_end")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "结束时间", example = "2021-01-01T00:00:00Z")
    private Date periodEnd;

    @ApiModelProperty(value = "状态", required = true, example = "AVAILABLE")
    private Status status;

}
