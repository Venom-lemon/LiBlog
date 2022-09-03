package com.liblog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LiblogSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiblogSearchApplication.class, args);
    }

}
