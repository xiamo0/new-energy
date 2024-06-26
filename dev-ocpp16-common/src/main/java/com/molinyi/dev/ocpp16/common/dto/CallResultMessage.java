package com.molinyi.dev.ocpp16.common.dto;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

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
@Data
@NoArgsConstructor
public class CallResultMessage<T extends BaseMessage> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uniqueId;

    private T payload;

    @Override
    public String toString() {
        return StrUtil.format("[{}, {}, {}]", MessageType.CALL_RESULT.getValue(),uniqueId, payload.toString());
    }
}
