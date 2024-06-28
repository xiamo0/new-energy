package com.molinyi.dev.ocpp16.common.dto.req;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.AuthorizationData;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.UpdateType;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendLocalListReq extends BaseMessage {

    @NonNull
    private Integer listVersion;

    private List<AuthorizationData> localAuthorizationList;

    @NonNull
    private UpdateType updateType;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

}
