package com.molinyi.dev.ocpi.common.v211.common.http;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Data
@NoArgsConstructor
public class OcpiGetParam {

    @ApiModelProperty(value = "偏移量", dataType = "integer", example = "0")
    private Integer offset;

    @ApiModelProperty(value = "限制量", dataType = "integer", example = "0")
    private Integer limit;

    @JsonProperty("date_from")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "起始时间", dataType = "string", example = "2021-01-01T00:00:00Z")
    private Date dateFrom;

    @JsonProperty("date_to")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "结束时间", dataType = "string", example = "2021-01-01T00:00:00Z")
    private Date dateTo;

    public static Map<String, String> toMap(@NonNull OcpiGetParam param) {
        Map<String, String> map = new HashMap<>();

        if (Objects.nonNull(param.getOffset())) {
            map.put("offset", String.valueOf(param.getOffset()));
        }

        if (Objects.nonNull(param.getLimit())) {
            map.put("limit", String.valueOf(param.getLimit()));
        }
        if (Objects.nonNull(param.getDateFrom())) {
            final String format = DateUtil.format(param.getDateFrom(), DatePattern.UTC_SIMPLE_PATTERN);
            map.put("date_from", format);
        }
        if (Objects.nonNull(param.getDateTo())) {
            final String format = DateUtil.format(param.getDateTo(), DatePattern.UTC_SIMPLE_PATTERN);
            map.put("date_to", format);
        }
        return map;
    }
}



