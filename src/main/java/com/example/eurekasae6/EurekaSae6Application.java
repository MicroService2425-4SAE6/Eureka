package com.example.eurekasae6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSae6Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSae6Application.class, args);
    }

}
