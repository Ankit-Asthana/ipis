package org.example.security.config;

import jakarta.servlet.annotation.WebFilter;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
//import org.example.security.JwtFilter;
//import org.jetbrains.annotations.NotNull;
//import org.example.service.AuthenticationResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.csrf.CookieServerCsrfTokenRepository;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig{
    private final AuthenticationProvider authenticationProvider;
    @Bean
    public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
        return new DefaultHandlerMappingIntrospector();
    }


    @Bean
    public SecurityFilterChain securityFilterChain(@NotNull HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/signup","/api/login")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider);
                //.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    private class DefaultHandlerMappingIntrospector extends HandlerMappingIntrospector {
    }
}




