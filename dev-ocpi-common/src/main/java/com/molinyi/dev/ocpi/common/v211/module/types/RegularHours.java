package com.molinyi.dev.ocpi.common.v211.module.types;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "正常运营时间明细")
public class RegularHours implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(min = 1, max = 7)
    @ApiModelProperty(value = "星期几")
    private int weekday;

    @JsonProperty("period_begin")
    @ApiModelProperty(value = "开始时间", example = "09:00")
    private String periodBegin;

    @JsonProperty("period_end")
    @ApiModelProperty(value = "结束时间", example = "21:00")
    private String periodEnd;
}
