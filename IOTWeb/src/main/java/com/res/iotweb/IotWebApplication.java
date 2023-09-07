package com.res.iotweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class IotWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotWebApplication.class, args);
    }

}
