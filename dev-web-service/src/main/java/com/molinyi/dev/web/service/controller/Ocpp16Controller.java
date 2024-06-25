package com.molinyi.dev.web.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ocpp16")
public class Ocpp16Controller {

    @PostMapping("/heartbeat")
    public ResponseEntity<Boolean> sendHeartbeat() {
        log.info("test");
        return ResponseEntity.ok(true);
    }
}
