package com.molinyi.dev.ocpi.common.v211.module.version.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import com.molinyi.dev.ocpi.common.v211.module.version.dto.VersionNumber;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_version_info")
public class VersionInfoEntity extends BaseEntity {


    @TableId
    private Long id;

    @JsonProperty("part_id")
    private String partId;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("version")
    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private VersionNumber ocpiVersion;

    private int status;

    private String url;

    public static int STATUS_IN_USE = 1;
    public static int STATUS_NO_USE = 0;


}
