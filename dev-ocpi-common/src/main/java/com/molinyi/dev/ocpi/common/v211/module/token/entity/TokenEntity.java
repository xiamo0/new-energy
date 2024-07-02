package com.molinyi.dev.ocpi.common.v211.module.token.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.TokenType;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.WhitelistType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@TableName(autoResultMap = true,value = "cse_ocpi_v211_token")
public class TokenEntity implements Serializable {
    private static final long serialVersionUID = 1L;


    @TableId(type = IdType.ASSIGN_UUID)
    private String uid;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private TokenType type;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String authId;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String visualNumber;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String issuer;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private Boolean valid;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private WhitelistType whitelist;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String language;

    private Date lastUpdated;

}
