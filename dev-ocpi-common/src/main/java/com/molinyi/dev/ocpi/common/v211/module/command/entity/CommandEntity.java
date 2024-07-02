package com.molinyi.dev.ocpi.common.v211.module.command.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.molinyi.dev.ocpi.common.v211.module.command.dto.CommandType;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.Token;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@TableName("ces_ocpi_v211_command")
public class CommandEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private CommandType commandType;

    private String responseUrl;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private Token token;

    private Date expiryDate;

    private String reservationId;

    private String locationId;

    private String evseUid;

    private String sessionId;

    private String result;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date lastUpdated;

}
