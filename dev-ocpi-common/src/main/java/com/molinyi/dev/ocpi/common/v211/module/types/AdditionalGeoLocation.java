package com.molinyi.dev.ocpi.common.v211.module.types;


import com.fasterxml.jackson.annotation.JsonInclude;
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
@ApiModel(description = "地理位置明细")
public class AdditionalGeoLocation implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 10)
    @ApiModelProperty(value = "纬度", required = true)
    private String latitude;

    @NonNull
    @Size(max = 11)
    @ApiModelProperty(value = "经度", required = true)
    private String longitude;

    @ApiModelProperty(value = "名称")
    private DisplayText name;

}
