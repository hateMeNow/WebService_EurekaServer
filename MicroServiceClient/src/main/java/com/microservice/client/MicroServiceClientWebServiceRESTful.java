package com.microservice.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MicroServiceClientWebServiceRESTful {

	private static final Logger log = LoggerFactory.getLogger(MicroServiceClientWebServiceRESTful.class);
	
	@Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/A-BOOTIFUL-CLIENT")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
    	
    	log.debug("[DEBUG] Entering RESTful Web Service!");
    	
        return this.discoveryClient.getInstances(applicationName);
    }
}
