package com.brian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
public class Service2Application {
    public static void main(String[] args) {

        SpringApplication.run(Service2Application.class, args);
        System.out.println("http://localhost:7002");
    }
}
