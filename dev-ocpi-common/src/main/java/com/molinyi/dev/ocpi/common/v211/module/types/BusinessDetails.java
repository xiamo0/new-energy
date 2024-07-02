package com.molinyi.dev.ocpi.common.v211.module.types;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.infypower.fycev.ocpi.v211.module.credential.entity.BusinessDetailsEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "业务明细")
public class BusinessDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "官网url", required = true)
    private String website;

    @ApiModelProperty(value = "logo信息")
    private Image logo;

}
