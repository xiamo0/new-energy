package com.molinyi.dev.gateway.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //@formatter:off
        return builder.routes()
                .route("biying_route", r -> r.path("/biying")
                        .uri("http://www.bing.com/"))
                .route("google_route", r -> r.path("/google")
                        .uri("https://www.google.com"))
                .route("ocpp16_hub_service_route", r -> r.path("/ocpp16hubservice/**")
                        .uri("lb://OCPP16-HUB-SERVICE"))
                .route("ocpp16_hub_service_route1", r -> r.path("/ocpp16hubservice1/**")
                        .uri("http://localhost:8001"))
                .build();

    }
}
