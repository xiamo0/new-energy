package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@ApiModel(description = "令牌信息")
public class Token implements Serializable {

    private static final long serialVersionUID = 1L;


    @NonNull
    @Size(max = 36)
    @ApiModelProperty(value = "令牌唯一标识", required = true, example = "1234567890")
    private String uid;

    @NonNull
    @ApiModelProperty(value = "令牌类型", required = true, example = "RFID")
    private TokenType type;

    @NonNull
    @Size(max = 36)
    @JsonProperty("auth_id")
    @ApiModelProperty(value = "授权ID", required = true, example = "1234567890")
    private String authId;

    @JsonProperty("visual_number")
    @ApiModelProperty(value = "可视化号码", example = "1234567890")
    private String visualNumber;

    @NonNull
    @Size(max = 64)
    @ApiModelProperty(value = "发行方", required = true, example = "1234567890")
    private String issuer;

    @NonNull
    @ApiModelProperty(value = "令牌是否有效", required = true, example = "true")
    private Boolean valid;

    @NonNull
    @ApiModelProperty(value = "白名单类型", required = true, example = "ALWAYS")
    private WhitelistType whitelist;

    @Size(max = 2)
    @ApiModelProperty(value = "语言", example = "zh")
    private String language;

    @NonNull
    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    @ApiModelProperty(value = "最后更新时间", required = true, example = "2021-01-01T00:00:00Z")
    private Date lastUpdated;


}
