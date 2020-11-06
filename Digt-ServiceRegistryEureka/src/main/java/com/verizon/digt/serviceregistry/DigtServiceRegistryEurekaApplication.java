package com.verizon.digt.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
@Slf4j
public class DigtServiceRegistryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtServiceRegistryEurekaApplication.class, args);
		log.info("******Eureka Server Started********");
	}

}
