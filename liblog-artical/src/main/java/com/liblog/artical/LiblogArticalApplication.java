package com.liblog.artical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient       //开启 nacos 注册
@SpringBootApplication
public class LiblogArticalApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiblogArticalApplication.class, args);
    }

}
