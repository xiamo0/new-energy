package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 充电开始前和充电结束前，都需要身份验证
 * 如果提交的 idTag 与开始交易时提交的 idTag 相同，则充电点在停止交易前不得发送 Authorize.req
 */
@Data
@NoArgsConstructor
public class AuthorizeReq extends BaseMessage {

    @JsonProperty(value = "idTag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idTag;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
