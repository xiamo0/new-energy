package com.molinyi.dev.ocpi.common.v211.module.tariff.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ApiModel(description = "费率限制因素")
public class TariffRestrictions implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("start_time")
    @JsonFormat(pattern = "HH:mm")
    @ApiModelProperty(value = "开始时间", example = "09:00")
    private Date startTime;

    @JsonProperty("end_time")
    @JsonFormat(pattern = "HH:mm")
    @ApiModelProperty(value = "结束时间", example = "09:00")
    private String endTime;

    @JsonProperty("start_date")
    @JsonFormat(pattern = DatePattern.NORM_DATE_PATTERN)
    @ApiModelProperty(value = "开始日期", example = "2000-01-01")
    private String startDate;

    @JsonProperty("end_date")
    @JsonFormat(pattern = DatePattern.NORM_DATE_PATTERN)
    @ApiModelProperty(value = "结束日期", example = "2000-01-01")
    private String endDate;

    @JsonProperty("min_kwh")
    @ApiModelProperty(value = "最小电量", example = "0.0")
    private Float minKwh;

    @JsonProperty("max_kwh")
    @ApiModelProperty(value = "最大电量", example = "0.0")
    private Float maxKwh;

    @JsonProperty("min_power")
    @ApiModelProperty(value = "最小功率", example = "0.0")
    private Float minPower;

    @JsonProperty("max_power")
    @ApiModelProperty(value = "最大功率", example = "0.0")
    private Float maxPower;

    @JsonProperty("min_duration")
    @ApiModelProperty(value = "最小时长/秒", example = "0.0")
    private Float minDuration;

    @JsonProperty("max_duration")
    @ApiModelProperty(value = "最大时长/秒", example = "0.0")
    private Float maxDuration;

    @JsonProperty("day_of_week")
    @ApiModelProperty(value = "在一周的那天有效", example = "0.0")
    private DayOfWeek dayOfWeek;

}

