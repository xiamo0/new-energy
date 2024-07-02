package com.molinyi.dev.ocpi.common.v211.module.session.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.AuthMethod;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.ChargingPeriod;
import com.molinyi.dev.ocpi.common.v211.module.location.dto.Location;
import com.molinyi.dev.ocpi.common.v211.module.session.dto.SessionStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_v211_session")
public class SessionEntity extends BaseEntity {

    @TableId
    private String id;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private String authorizationId;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private Date startDatetime;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private Date endDatetime;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private Float kwh;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private String authId;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private AuthMethod authMethod;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private Location location;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private String meterId;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private String currency;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private List<ChargingPeriod> chargingPeriods;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL)
    private Float totalCost;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private SessionStatus status;

}
