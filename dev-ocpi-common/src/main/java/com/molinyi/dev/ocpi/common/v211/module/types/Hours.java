package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "时间")
public class Hours implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("twentyfourseven")
    @ApiModelProperty(value = "是否24h营业", required = true)
    private Boolean twentyfourseven;

    @JsonProperty("regular_hours")
    @ApiModelProperty(value = "正常营业时间明细")
    private List<RegularHours> regularHours;

    @JsonProperty("exceptional_openings")
    @ApiModelProperty(value = "例外营业时间明细")
    private List<ExceptionalPeriod> exceptionalOpenings;

    @JsonProperty("exceptional_closings")
    @ApiModelProperty(value = "例外闭业时间明细")
    private List<ExceptionalPeriod> exceptionalClosings;

}
