package com.microservice.service.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	
	private static final Logger log = LoggerFactory.getLogger(EurekaServiceApplication.class);

	
	public static void main(String[] args) {
		
		log.debug("[DEBUG] EurekaServiceApplicatoin, launch the EurekaServiceApplication");
		
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
