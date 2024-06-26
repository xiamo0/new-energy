package com.molinyi.dev.ocpp16.hub.service.controller;

import com.molinyi.dev.ocpp16.hub.service.cache.Ocpp16CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private Ocpp16CacheService ocpp16CacheService;

    @GetMapping("/online-evse")
    public long onlineEvse() {

        log.info("online-evse {} ", ocpp16CacheService.getSessionCount());
        return ocpp16CacheService.getSessionCount();

    }

}
