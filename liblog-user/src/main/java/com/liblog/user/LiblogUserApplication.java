package com.liblog.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LiblogUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiblogUserApplication.class, args);
    }

}
