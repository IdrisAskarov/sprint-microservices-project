package com.mightycoder.sprmicrosproj1.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegestryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegestryApplication.class, args);
    }

}
