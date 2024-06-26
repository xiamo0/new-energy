package com.molinyi.dev.ocpp16.common.dto;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * [<MessageTypeId>, "<UniqueId>", "<Action>", {<Payload>}]
 * [2,
 * "19223201",
 * "BootNotification",
 * {"chargePointVendor": "VendorX", "chargePointModel": "SingleSocketCharger"}
 * ]
 */
@Data
@NoArgsConstructor
public class CallMessage<T extends BaseMessage> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uniqueId;

    private String action;

    private T payload;

    @Override
    public String toString() {

        return StrUtil.format("[{}, {}, {}, {}]", MessageType.CALL.getValue(), uniqueId, action, payload.toString());

    }
}
