package com.junah.servicesleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServiceSleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSleuthApplication.class, args);
        System.out.println("===============================================");
        System.out.println("==========service-sleuth is successful=========");
        System.out.println("===============================================");
    }

}

