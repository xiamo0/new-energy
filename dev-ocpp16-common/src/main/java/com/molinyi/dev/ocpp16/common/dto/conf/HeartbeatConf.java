package com.molinyi.dev.ocpp16.common.dto.conf;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.req.HeartbeatReq;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class HeartbeatConf extends BaseMessage {

    @JsonProperty(value = "currentTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime currentTime;

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        final HeartbeatConf heartbeatConf = new HeartbeatConf();
        System.out.println(heartbeatConf);
        heartbeatConf.setCurrentTime(LocalDateTime.now());
        System.out.println(heartbeatConf);

        final HeartbeatReq heartbeatReq = new HeartbeatReq();
        System.out.println(heartbeatReq);

        final HeartbeatConf heartbeatConf1 = BaseMessage.deSerializable(heartbeatConf.toString(), HeartbeatConf.class);
        System.out.println(heartbeatConf1);
    }
}
