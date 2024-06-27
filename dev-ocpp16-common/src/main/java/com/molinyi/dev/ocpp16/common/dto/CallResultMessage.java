package com.molinyi.dev.ocpp16.common.dto;

import cn.hutool.core.util.StrUtil;

import java.io.Serializable;

/**
 * CallResult
 * [<MessageTypeId>, "<UniqueId>", {<Payload>}]
 * [3,
 * "19223201",
 * {"status":"Accepted", "currentTime":"2013-02-01T20:53:32.486Z", "heartbeatInterval":300}
 * ]
 */
//@Slf4j
public record CallResultMessage<T extends BaseMessage>(String uniqueId, T payload) implements Serializable {


    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return StrUtil.format("[{}, {}, {}]", MessageType.CALL_RESULT.getValue(), uniqueId, payload.toString());
    }
}
