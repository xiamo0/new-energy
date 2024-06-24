package com.molinyi.dev.ocpp16.hub.service.controller;

import com.molinyi.dev.ocpp16.hub.service.cache.Ocpp16CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/system")
public class SystemController {


    @GetMapping("/online-evse")
    public long onlineEvse() {

        log.info("online-evse {} ", Ocpp16CacheService.getSessionCount());
        return Ocpp16CacheService.getSessionCount();

    }

}
