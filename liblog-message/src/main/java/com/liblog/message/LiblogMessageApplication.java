package com.liblog.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LiblogMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiblogMessageApplication.class, args);
    }

}
