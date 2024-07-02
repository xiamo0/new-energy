package com.molinyi.dev.ocpi.common.v211.module.types;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    AVAILABLE("AVAILABLE"),//EVSE/Connector 可以启动新的充电会话
    BLOCKED("BLOCKED"),//由于存在物理障碍（如汽车），无法访问 EVSE/连接器。
    CHARGING("CHARGING"),//正在使用 EVSE/连接器。
    INOPERATIVE("INOPERATIVE"),//EVSE/ 连接器尚未激活或已不可用（已删除）
    OUTOFORDER("OUTOFORDER"),//目前，EVSE/连接器处于故障状态
    PLANNED("PLANNED"),//该电动汽车SE/连接器已列入计划，将很快投入使用
    REMOVED("REMOVED"),//EVSE/ 连接器/充电点已停用/拆除。
    RESERVED("RESERVED"),//EVSE/Connector 是为特定电动汽车驾驶员保留的，其他驾驶员无法使用。
    UNKNOWN("UNKNOWN");//无状态信息。(脱机时也使用）

    @JsonValue
    @EnumValue
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final String value;


}
