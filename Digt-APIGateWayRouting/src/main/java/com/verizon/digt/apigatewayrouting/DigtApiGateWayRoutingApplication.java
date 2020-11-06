package com.verizon.digt.apigatewayrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@Slf4j
public class DigtApiGateWayRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtApiGateWayRoutingApplication.class, args);
		log.info("*****DigtApiGateWayRoutingApplication Started********");
	}

}
