/*This is Producer Application*/

package com.verizon.digt.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = "com.verizon.digt.department")
@EnableAutoConfiguration
@EnableEurekaClient
@Slf4j
public class DigtDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigtDepartmentServiceApplication.class, args);
		log.info("********DigtDepartmentServiceApplication Started************");
	}

}
