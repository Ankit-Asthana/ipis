package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 The main class of the RMS  application.
 This class uses the Spring Boot framework to bootstrap and launch the application.
 */
@SpringBootApplication
public class RmsMain {
    public RmsMain()  {
    }

    public static void main(String[] args) {
        SpringApplication.run(RmsMain.class, args);
    }
	// @Bean(name="remoteRestTemplate")
	// public RestTemplate restTemplate() {
	// 	return new RestTemplate();
	// }

    // @Bean
    // public RestTemplate restTemplate(RestTemplateBuilder builder) {
    //     return builder.build();
    // }
}
