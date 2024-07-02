package com.molinyi.dev.ocpi.common.v211.module.version.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@ApiModel(description = "版本明细")
public class Version {

    @NonNull
    @JsonProperty
    @ApiModelProperty(value = "版本号", required = true)
    private VersionNumber version;

    @NonNull
    @Size(max = 255)
    @ApiModelProperty(value = "版本链接", required = true)
    private String url;

}

