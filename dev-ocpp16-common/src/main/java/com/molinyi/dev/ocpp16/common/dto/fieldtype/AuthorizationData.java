package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorizationData extends BaseMessage {

    @NonNull
    private IdToken idTag;

    private IdTagInfo idTagInfo;

    @Override
    public String toString() {
       return this.serialize();
    }
}
