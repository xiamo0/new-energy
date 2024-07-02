package com.molinyi.dev.ocpi.common.v211.module.credential.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName("ces_ocpi_v211_image")
public class LogoEntity extends BaseEntity {

    @ApiModelProperty("主键")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String url;
    private String thumbnail;
    private String category;
    private String type;
    private Float width;
    private Float height;

}
