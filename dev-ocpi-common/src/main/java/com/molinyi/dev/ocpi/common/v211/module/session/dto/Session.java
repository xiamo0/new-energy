package com.molinyi.dev.ocpi.common.v211.module.session.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.AuthMethod;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.ChargingPeriod;
import com.molinyi.dev.ocpi.common.v211.module.location.dto.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ApiModel(description = "充电会话明细")
public class Session implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 36)
    @ApiModelProperty(value = "会话ID", required = true, example = "1234567890")
    private String id;

    @ApiModelProperty(value = "授权ID")
    private String authorizationId;

    @NonNull
    @JsonProperty("start_datetime")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "开始时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date startDatetime;

    @JsonProperty("end_datetime")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "结束时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date endDatetime;

    @NonNull
    @ApiModelProperty(value = "充电量", required = true, example = "100.0")
    private Float kwh;

    @NonNull
    @Size(max = 36)
    @JsonProperty("auth_id")
    @ApiModelProperty(value = "关联token", required = true, example = "100")
    private String authId;

    @NonNull
    @JsonProperty("auth_method")
    @ApiModelProperty(value = "认证方法", required = true, example = "WHITELIST")
    private AuthMethod authMethod;

    @ApiModelProperty(value = "位置信息", required = true)
    private Location location;

    @Size(max = 255)
    @JsonProperty("meter_id")
    @ApiModelProperty(value = "电表编号")
    private String meterId;

    @NonNull
    @Size(max = 3)
    @ApiModelProperty(value = "货币", required = true)
    private String currency;

    @JsonProperty("charging_periods")
    @ApiModelProperty(value = "充电片段明细")
    private List<ChargingPeriod> chargingPeriods;

    @JsonProperty("total_cost")
    @ApiModelProperty(value = "总费用", required = true, example = "100.0")
    private Float totalCost;

    @NonNull
    @ApiModelProperty(value = "会话状态", required = true)
    private SessionStatus status;


    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date lastUpdated;

}
