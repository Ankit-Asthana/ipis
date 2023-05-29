package org.example.service;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
//pass the username after security gets added in it
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Ankit");
    }
}
