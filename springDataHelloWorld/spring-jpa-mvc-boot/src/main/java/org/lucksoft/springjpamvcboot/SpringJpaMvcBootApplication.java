package org.lucksoft.springjpamvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringJpaMvcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMvcBootApplication.class, args);
	}
}
