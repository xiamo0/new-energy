package com.molinyi.dev.ocpi.common.v211.module.token.dto;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@ApiModel(description = "位置信息")
public class LocationReferences implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @Size(max = 39)
    @JSONField(name = "location_id")
    @ApiModelProperty(value = "位置ID", required = true, example = "DE*12345678")
    private String locationId;

    @JSONField(name = "evse_uids")
    @ApiModelProperty(value = "充电桩列表")
    private List<String> evseUids;

    @JSONField(name = "connector_ids")
    @ApiModelProperty(value = "充电枪")
    private List<String> connectorIds;

}
