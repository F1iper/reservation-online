package com.kamann;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class KamannApplication {
    public static void main(String[] args) {
        SpringApplication.run(KamannApplication.class, args);
    }
}
