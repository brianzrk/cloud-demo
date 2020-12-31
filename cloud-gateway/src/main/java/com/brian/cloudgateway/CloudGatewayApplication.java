package com.brian.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  该注解可以注册到非eureka注册中心
 * -@EnableDiscoveryClient
 *  该注解只能注册到eureka注册中心
 * -@EnableEurekaClient
 *
 * @author kai
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
