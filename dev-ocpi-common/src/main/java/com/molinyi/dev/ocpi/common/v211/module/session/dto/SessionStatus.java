package com.molinyi.dev.ocpi.common.v211.module.session.dto;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SessionStatus {

    ACTIVE("ACTIVE"),//会话已被接受并激活。满足所有前提条件： 电动汽车与 EVSE 之间有通信（例如：电缆已正确插入），电动汽车或驾驶员已获得授权。电动汽车正在充电或可以充电。能量正在或尚未传输
    COMPLETED("COMPLETED"),//会话已成功结束。不会再对该会话进行修改。
    INVALID("INVALID"),//会话被宣布无效，将不计费
    PENDING("PENDING");//会话待定，尚未开始。并非所有前提条件都已满足。这是初始状态。该会话可能永远不会成为活动会话。

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;
}
