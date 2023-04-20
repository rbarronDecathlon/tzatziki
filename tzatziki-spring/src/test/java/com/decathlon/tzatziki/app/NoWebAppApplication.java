package com.decathlon.tzatziki.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.decathlon")
@EnableCaching
public class NoWebAppApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestApplication.class).web(WebApplicationType.NONE).run(args);
    }

}
