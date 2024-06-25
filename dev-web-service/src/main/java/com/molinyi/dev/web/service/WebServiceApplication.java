package com.molinyi.dev.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebServiceApplication.class, args);

    }
}
