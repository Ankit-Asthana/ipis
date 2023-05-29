package org.example.model;

import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public JSONParser jsonParser(){
        return new JSONParser();
    }
}
