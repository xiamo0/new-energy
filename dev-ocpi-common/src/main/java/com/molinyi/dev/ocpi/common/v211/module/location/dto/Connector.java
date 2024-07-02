package com.molinyi.dev.ocpi.common.v211.module.location.dto;


import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.molinyi.dev.ocpi.common.v211.module.types.ConnectorFormat;
import com.molinyi.dev.ocpi.common.v211.module.types.ConnectorType;
import com.molinyi.dev.ocpi.common.v211.module.types.PowerType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "电枪明细")
public class Connector implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 36)
    @ApiModelProperty(value = "电枪ID", required = true, example = "1234567890123456789012")
    private String id;

    @NonNull
    @ApiModelProperty(value = "电枪类型", required = true, example = "IEC_62196_T2_COMBO")
    private ConnectorType standard;

    @NonNull
    @ApiModelProperty(value = "电枪格式", required = true, example = "SOCKET")
    private ConnectorFormat format;

    @NonNull
    @JsonProperty("power_type")
    @ApiModelProperty(value = "电源类型", required = true, example = "DC")
    private PowerType powerType;

    @NonNull
    @ApiModelProperty(value = "电压", required = true, example = "230")
    private Integer voltage;

    @NonNull
    @ApiModelProperty(value = "最大电流", required = true, example = "16")
    private Integer amperage;

    @Size(max = 36)
    @JsonProperty("tariff_id")
    @ApiModelProperty(value = "费率ID", example = "1234567890123456789012")
    private String tariffId;

    @JsonProperty("terms_and_conditions")
    @Size(max = 255)
    @ApiModelProperty(value = "费率条款", example = "https://fycev.com/terms")
    private String termsAndConditions;

    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_SIMPLE_PATTERN)
    @ApiModelProperty(value = "更新时间", required = true, example = "2024-06-18T19:20:31Z")
    private Date lastUpdated;

}
