package com.molinyi.dev.ocpp16.common.dto;

import cn.hutool.core.util.StrUtil;

/**
 * [<MessageTypeId>, "<UniqueId>", "<Action>", {<Payload>}]
 * [2,
 * "19223201",
 * "BootNotification",
 * {"chargePointVendor": "VendorX", "chargePointModel": "SingleSocketCharger"}
 * ]
 */

public record CallMessage<T extends BaseMessage>(String uniqueId, String action, T payload) {

    @Override
    public String toString() {

        return StrUtil.format("[{}, {}, {}, {}]", MessageType.CALL.getValue(), uniqueId, action, payload.toString());

    }

}
