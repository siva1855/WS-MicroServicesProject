package com.verizon.digt.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
@Slf4j
public class DigtHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtHystrixDashboardApplication.class, args);
		log.info("*******DigtHystrixDashboardApplication Started**********");
	}

}
