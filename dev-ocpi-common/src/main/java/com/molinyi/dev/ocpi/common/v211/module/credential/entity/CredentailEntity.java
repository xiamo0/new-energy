package com.molinyi.dev.ocpi.common.v211.module.credential.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName("ces_ocpi_v211_credentails")
public class CredentailEntity extends BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long uid;
    private String partId;

    @ApiModelProperty("证书验证方，0:我方验证对方，1：对方验证我方")
    private Integer direction;

    @ApiModelProperty("url")
    @Size(max = 255)
    private String url;

    @ApiModelProperty("token")
    private String token;

    private String countryCode;

    @TableField(value = "business_details_id")
    private Long businessDetailsId;

}
