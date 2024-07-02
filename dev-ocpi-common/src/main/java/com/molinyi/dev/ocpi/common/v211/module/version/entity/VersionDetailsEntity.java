package com.molinyi.dev.ocpi.common.v211.module.version.entity;

import cn.hutool.core.date.DatePattern;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.version.dto.ModuleID;
import com.molinyi.dev.ocpi.common.v211.module.version.dto.VersionNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_v211_version_details")
public class VersionDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    @JsonProperty("part_id")
    private String partId;

    @JsonProperty("country_code")
    private String countryCode;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    @JsonProperty("version")
    private VersionNumber ocpiVersion;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private ModuleID module;

    private String url;

    @JsonProperty("last_updated")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime lastUpdated;

}
