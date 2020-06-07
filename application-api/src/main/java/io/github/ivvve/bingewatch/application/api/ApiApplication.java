package io.github.ivvve.bingewatch.application.api;

import io.github.ivvve.bingewatch.domain.webdrama.EnableDomainWebDramaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.ivvve.bingewatch")
@EnableDomainWebDramaModule
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
