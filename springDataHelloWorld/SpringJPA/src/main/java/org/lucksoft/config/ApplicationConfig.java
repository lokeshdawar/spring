package org.lucksoft.config;

import org.lucksoft.services.UserService;
import org.lucksoft.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lucksoft")
@PropertySource("classpath:application/application.properties")
public class ApplicationConfig {
	
	@Bean(name="userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}

}
