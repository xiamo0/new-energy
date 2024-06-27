package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

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
