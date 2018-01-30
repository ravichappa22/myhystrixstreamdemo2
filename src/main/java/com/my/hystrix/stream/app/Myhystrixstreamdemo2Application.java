package com.my.hystrix.stream.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients(basePackages="com.my.hystrix.stream.app.service")
public class Myhystrixstreamdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myhystrixstreamdemo2Application.class, args);
	}
}
