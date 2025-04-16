package com.mycrommerce.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
            .authorizeExchange(exchanges -> exchanges
                .pathMatchers("/api/**").authenticated()
                .anyExchange().permitAll()
            )
            .csrf(ServerHttpSecurity.CsrfSpec::disable)
            .formLogin()
            .and()
            .httpBasic();

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User
            .withUsername("admin")
            .password("{noop}password")
            .roles("ADMIN")
            .build();

        return new InMemoryUserDetailsManager(user);
    }

}
