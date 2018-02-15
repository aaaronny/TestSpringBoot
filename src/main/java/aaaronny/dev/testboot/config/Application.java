package aaaronny.dev.testboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan( basePackages = {"aaaronny.dev.testboot.model"})
@EnableJpaRepositories("com.discogest.dao")
@SpringBootApplication(scanBasePackages={"aaaronny.dev.testboot.controller", "aaaronny.dev.testboot.dao"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

