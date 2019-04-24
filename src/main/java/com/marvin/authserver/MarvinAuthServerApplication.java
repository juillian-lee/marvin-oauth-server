package com.marvin.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarvinAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvinAuthServerApplication.class, args);
	}

}
