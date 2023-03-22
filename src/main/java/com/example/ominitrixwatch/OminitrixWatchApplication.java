package com.example.ominitrixwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"entities",
        "repository",})
public class OminitrixWatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(OminitrixWatchApplication.class, args);
    }

}
