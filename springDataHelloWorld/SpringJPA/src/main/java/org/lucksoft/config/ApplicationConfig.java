package org.lucksoft.config;

import org.lucksoft.services.UserService;
import org.lucksoft.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean(name="userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}

}
