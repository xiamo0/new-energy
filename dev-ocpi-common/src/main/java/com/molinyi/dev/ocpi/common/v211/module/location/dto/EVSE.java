package com.molinyi.dev.ocpi.common.v211.module.location.dto;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.types.*;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "充电桩明细")
public class EVSE implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 39)
    @ApiModelProperty(value = "充电桩唯一标识符", required = true)
    private String uid;

    @Size(max = 48)
    @JsonProperty("evse_id")
    @ApiModelProperty(value = "充电桩唯一标识符")
    private String evseId;

    @NonNull
    @ApiModelProperty(value = "状态", required = true, example = "AVAILABLE")
    private Status status;

    @JsonProperty("status_schedule")
    @ApiModelProperty(value = "未来的计划调度明细")
    private List<StatusSchedule> statusSchedule;

    @JsonProperty("capabilities")
//todo 反序列化ex
    @ApiModelProperty(value = "功能")
    private List<Capability> capabilities;

    @ApiModelProperty(value = "电枪列表", required = true)
    private List<Connector> connectors;

    @JsonProperty("floor_level")
    @ApiModelProperty(value = "楼层")
    private String floorLevel;

    @ApiModelProperty(value = "坐标")
    private GeoLocation coordinates;

    @JsonProperty("physical_reference")
    @ApiModelProperty("物理参考")
    private String physicalReference;

    @ApiModelProperty(value = "导航说明")
    private List<DisplayText> directions;

    @JsonProperty("parking_restrictions")
    //todo 反序列化ex
    @ApiModelProperty(value = "停车限制")
    private List<ParkingRestriction> parkingRestrictions;

    @ApiModelProperty(value = "图片信息")
    private List<Image> images;

    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", required = true, example = "2020-01-01T00:00:00Z")
    private Date lastUpdated;

}
