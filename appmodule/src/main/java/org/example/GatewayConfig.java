package org.example;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        System.out.println("------------------abc---------------");
        return builder.routes()
                .route("aggregator", r -> r.path("aggregator/**")
                        .uri("localhost:8081/"))
                .build();
    }

}
