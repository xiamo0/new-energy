package com.molinyi.dev.ocpi.common.v211.module.cdr.dto;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.location.dto.Location;
import com.molinyi.dev.ocpi.common.v211.module.tariff.dto.Tariff;
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
@ApiModel(description = "充电订单信息")
public class Cdr implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "在cpo平台唯一标识", example = "12345")
    private String id;

    @ApiModelProperty(value = "授权编号", example = "12345")
    private String authorizationId;

    @NonNull
    @JsonProperty("start_date_time")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "开始时间", example = "2021-01-01T00:00:00Z")
    private Date startDateTime;

    @NonNull
    @JsonProperty("stop_date_time")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "结束时间", example = "2021-01-01T00:00:00Z")
    private Date stopDateTime;

    @NonNull
    @Size(max = 36)
    @JsonProperty("auth_id")
    @ApiModelProperty(value = "关联token")
    private String authId;

    @NonNull
    @JsonProperty("auth_method")
    @ApiModelProperty(value = "验证的方法", example = "WHITELIST")
    private AuthMethod authMethod;

    @NonNull
    @ApiModelProperty(value = "位置信息")
    private Location location;

    @NonNull
    @JsonProperty("meter_id")
    @Size(max = 255)
    @ApiModelProperty(value = "电表id", example = "12345")
    private String meterId;

    @NonNull
    @Size(max = 3)
    @ApiModelProperty(value = "货币", example = "CNY")
    private String currency;

    @ApiModelProperty(value = "充电收费信息")
    private List<Tariff> tariffs;

    @NonNull
    @JsonProperty("charging_periods")
    @ApiModelProperty(value = "充电时长列表")
    private List<ChargingPeriod> chargingPeriods;

    @NonNull
    @JsonProperty("total_cost")
    @ApiModelProperty(value = "总费用", example = "10.00")
    private Float totalCost;

    @NonNull
    @JsonProperty("total_energy")
    @ApiModelProperty(value = "总电量", example = "10.00")
    private Float totalEnergy;

    @NonNull
    @JsonProperty("total_time")
    @ApiModelProperty(value = "总时长", example = "10.00")
    private Float totalTime;

    @JsonProperty("total_parking_time")
    @ApiModelProperty(value = "总停车时长", example = "10.00")
    private Float totalParkingTime;


    @Size(max = 255)
    @ApiModelProperty(value = "备注", example = "备注信息")
    private String remark;

    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", example = "2021-01-01T00:00:00Z")
    private Date lastUpdated;


}
