package com.molinyi.dev.ocpi.common.v211.module.location.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.common.entity.BaseEntity;
import com.molinyi.dev.ocpi.common.v211.module.types.ConnectorFormat;
import com.molinyi.dev.ocpi.common.v211.module.types.ConnectorType;
import com.molinyi.dev.ocpi.common.v211.module.types.PowerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_v211_connector")
public class ConnectorEntity extends BaseEntity {

    @TableId
    private String uid;

    //EVSE 中连接器的标识符。
    //只要不属于同一个 EVSE 对象，两个连接器就可以具有相同的 ID。
    private String id;


    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private ConnectorType standard;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private ConnectorFormat format;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    @JsonProperty("power_type")
    private PowerType powerType;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private Integer voltage;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private Integer amperage;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("tariff_id")
    private String tariffId;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("terms_and_conditions")
    private String termsAndConditions;

}
