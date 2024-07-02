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
@ApiModel(description = "位置信息")
public class Location  implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 39)
    @ApiModelProperty(value = "位置ID", required = true, example = "DE*123456789*1")
    private String id;

    @ApiModelProperty(value = "位置类型", required = true, example = "PARKING_GARAGE")
    private LocationType type;

    @Size(max = 255)
    @ApiModelProperty(value = "位置名称", example = "Parking garage")
    private String name;

    @NonNull
    @Size(max = 45)
    @ApiModelProperty(value = "地址", required = true, example = "新洲祠堂村1#")
    private String address;

    @NonNull
    @Size(max = 45)
    @ApiModelProperty(value = "城市", required = true, example = "上海市")
    private String city;

    @NonNull
    @JsonProperty("postal_code")
    @Size(max = 10)
    @ApiModelProperty(value = "邮政编码", required = true, example = "200000")
    private String postalCode;

    @NonNull
    @Size(max = 3)
    @ApiModelProperty(value = "国家", required = true, example = "CN")
    private String country;

    @ApiModelProperty(value = "地理坐标", required = true, example = "31.234567,121.456789")
    private GeoLocation coordinates;

    @JsonProperty("related_locations")
    @ApiModelProperty(value = "相关位置")
    private List<AdditionalGeoLocation> relatedLocations;

    @JsonProperty("evses")
    @ApiModelProperty(value = "充电桩")
    private List<EVSE> evses;

    @ApiModelProperty(value = "描述")
    private List<DisplayText> directions;

    @ApiModelProperty(value = "运营商")
    private BusinessDetails operator;

    @ApiModelProperty(value = "分支机构")
    private BusinessDetails suboperator;

    @ApiModelProperty(value = "所有者")
    private BusinessDetails owner;

    @JsonProperty("facilities")
    @ApiModelProperty(value = "设施")
    private List<Facility> facilities;

    @NonNull
    @JsonProperty("time_zone")
    @Size(max = 255)
    @ApiModelProperty(value = "时区", required = true, example = "Asia/Shanghai")
    private String timeZone;

    @JsonProperty("opening_times")
    @ApiModelProperty(value = "营业时间")
    private Hours openingTimes;

    @JsonProperty("charging_when_closed")
    @ApiModelProperty(value = "是否允许充电")
    private Boolean chargingWhenClosed;

    @ApiModelProperty(value = "图片信息")
    private List<Image> images;

    @JsonProperty("energy_mix")
    @ApiModelProperty(value = "能源成分")
    private EnergyMix energyMix;

    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date lastUpdated;

}
