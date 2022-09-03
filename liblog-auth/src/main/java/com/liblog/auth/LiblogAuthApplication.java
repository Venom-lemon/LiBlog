package com.liblog.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LiblogAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiblogAuthApplication.class, args);
    }

}
