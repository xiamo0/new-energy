package com.molinyi.dev.web.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("OCPP16-HUB-SERVICE")
public interface Ocpp16HubServiceClient {
    @RequestMapping(value = "/system/online-evse", method = RequestMethod.GET)
    long onlineEvse();

}