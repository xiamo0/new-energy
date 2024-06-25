package com.molinyi.dev.registrycenter.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistrycenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(RegistrycenterApplication.class, args);

    }

}
