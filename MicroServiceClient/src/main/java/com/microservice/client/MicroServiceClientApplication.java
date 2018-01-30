package com.microservice.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceClientApplication {

	private static final Logger log = LoggerFactory.getLogger(MicroServiceClientApplication.class);

	public static void main(String[] args) {
		
		log.debug("[DEBUG] Entering Main MicroServiceClientApplication");
		
		SpringApplication.run(MicroServiceClientApplication.class, args);
	}
}
