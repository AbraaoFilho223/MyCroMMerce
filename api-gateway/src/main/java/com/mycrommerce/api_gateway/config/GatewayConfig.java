package com.mycrommerce.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class to define routes for microservices.
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()

                // Product Service
                .route("product-service", r -> r.path("/api/products/**")
                        .uri("http://localhost:8081"))

                // Order Service
                .route("order-service", r -> r.path("/api/orders/**")
                        .uri("http://localhost:8082"))

                // User Service
                .route("user-service", r -> r.path("/api/users/**")
                        .uri("http://localhost:8083"))

                // Payment Service
                .route("payment-service", r -> r.path("/api/payments/**")
                        .uri("http://localhost:8084"))

                .build();
    }
}
