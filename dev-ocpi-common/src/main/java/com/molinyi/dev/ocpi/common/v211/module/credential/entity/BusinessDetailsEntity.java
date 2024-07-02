package com.molinyi.dev.ocpi.common.v211.module.credential.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName("ces_ocpi_v211_business_details")
public class BusinessDetailsEntity extends BaseEntity {

    @ApiModelProperty("主键")
    private Long id;

    private String name;

    private String logo;

    private String website;

}
