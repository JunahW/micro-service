package com.junah.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication.class, args);
        System.out.println("===============================================");
        System.out.println("=============Eurekaq is successful=============");
        System.out.println("===============================================");
    }

}

