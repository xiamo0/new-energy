package com.molinyi.dev.ocpi.common.v211.module.credential.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.types.BusinessDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ApiModel(description = "凭证信息")
public class Credentials implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 64)
    @ApiModelProperty(value = "对方在我方系统中进行在系统中进行身份验证的令牌", required = true)
    private String token;

    @NonNull
    @Size(max = 250)
    @ApiModelProperty(value = "版本端点的URL", required = true)
    private String url;

    @NonNull
    @JsonProperty("business_details")
    @ApiModelProperty(value = "业务信息", required = true)
    private BusinessDetails businessDetails;

    @NonNull
    @Size(max = 3, min = 3)
    @JsonProperty("party_id")
    @ApiModelProperty(value = "组织标号", required = true)
    private String partyId;

    @NonNull
    @Size(max = 2, min = 2)
    @JsonProperty("country_code")
    @ApiModelProperty(value = "国家编号", required = true)
    private String countryCode;


}
