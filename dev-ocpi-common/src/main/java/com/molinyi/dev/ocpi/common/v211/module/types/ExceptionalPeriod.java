package com.molinyi.dev.ocpi.common.v211.module.types;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(description = "例外时间段")
public class ExceptionalPeriod implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("period_begin")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "例外时间段开始时间", required = true)
    private Date periodBegin;

    @NonNull
    @JsonProperty("period_end")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "例外时间段结束时间", required = true)
    private Date periodEnd;
}
