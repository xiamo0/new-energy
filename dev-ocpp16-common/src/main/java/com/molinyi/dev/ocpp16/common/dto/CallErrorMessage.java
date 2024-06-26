package com.molinyi.dev.ocpp16.common.dto;


import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * CallError
 * [<MessageTypeId>, "<UniqueId>", "<errorCode>", "<errorDescription>", {<errorDetails>}]
 */
@Data
@NoArgsConstructor
public class CallErrorMessage<T extends BaseMessage> implements Serializable {

    private String uniqueId;
    private String errorCode;
    private String errorDescription;
    private T errorDetails;

    @Override
    public String toString() {
        return StrUtil.format("[{}, {}, {}, {}, {}]", MessageType.CALL_ERROR.getValue(), uniqueId, errorCode, errorDescription, errorDetails.toString());
    }
}
