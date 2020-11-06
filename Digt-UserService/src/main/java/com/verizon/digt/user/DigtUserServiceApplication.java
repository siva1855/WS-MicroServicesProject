/*This is Consumer Application*/

package com.verizon.digt.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = "com.verizon.digt.user")
@EnableAutoConfiguration
@EnableFeignClients
@EnableEurekaClient
@Slf4j
public class DigtUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtUserServiceApplication.class, args);
		log.info("*******DigtUserServiceApplication Started********");
	}

}
