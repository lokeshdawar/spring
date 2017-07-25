package org.lucksoft.eurekaclientitemreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientItemreviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientItemreviewApplication.class, args);
	}
}
