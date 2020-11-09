package com.verizon.digt.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = "com.verizon.digt.adminserver")
@EnableAdminServer
@EnableAutoConfiguration
@EnableEurekaClient
@Slf4j
public class DigtAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtAdminServerApplication.class, args);
		log.info("******DigtAdminServerApplication Started******");
	}

}
