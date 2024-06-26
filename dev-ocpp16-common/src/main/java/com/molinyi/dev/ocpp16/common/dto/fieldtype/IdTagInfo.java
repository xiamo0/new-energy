package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdTagInfo extends BaseMessage {

    private static final long serialVersionUID = 1L;

    @JsonProperty("expiryDate")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime expiryDate;

    @JsonProperty("parentIdTag")
    private String parentIdTag;

    @JsonProperty("status")
    private AuthorizationStatus status;

    @Override
    public String toString() {
        return this.serialize();
    }
}
