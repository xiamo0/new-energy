package com.molinyi.dev.web.service.controller;

import com.molinyi.dev.web.service.openfeign.Ocpp16HubServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Ocpp16HubServiceClient ocpp16HubServiceClient;

    @GetMapping("/info")
    public String test() {
        return "test";
    }

    @GetMapping("/online-evse")
    public long onlineEvse() {
        return ocpp16HubServiceClient.onlineEvse();
    }
}
