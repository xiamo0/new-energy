package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "图片明细")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 255)
    @ApiModelProperty(value = "图片URL", required = true)
    private String url;

    @JsonProperty("thumbnail")
    @Size(max = 255)
    @ApiModelProperty(value = "缩略图URL", required = true)
    private String thumbnail;

    @NonNull
    @ApiModelProperty(value = "图片类别", required = true)
    private ImageCategory category;

    @NonNull
    @Size(max = 4)
    @ApiModelProperty(value = "图片格式", required = true, example = "png")
    private String type;

    @ApiModelProperty(value = "图片宽度")
    private Float width;

    @ApiModelProperty(value = "图片高度")
    private Float height;

}
