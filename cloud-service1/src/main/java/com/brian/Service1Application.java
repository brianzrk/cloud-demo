package com.brian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kai
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1Application {

    public static void main( String[] args ) {

        SpringApplication.run(Service1Application.class, args);
        System.out.println("http://localhost:7001");
    }
}
