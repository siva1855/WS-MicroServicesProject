package com.verizon.digt.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@Slf4j
public class DigtCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtCloudConfigServerApplication.class, args);
		log.info("*******DigtCloudConfigServerApplication Started*******");
	}

}
