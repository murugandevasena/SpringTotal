package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiGatewayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayProjectApplication.class, args);
	}
}
