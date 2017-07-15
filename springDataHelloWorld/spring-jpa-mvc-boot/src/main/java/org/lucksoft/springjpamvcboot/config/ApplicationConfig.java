package org.lucksoft.springjpamvcboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("org.lucksoft.springjpamvcboot.services")
public class ApplicationConfig {
}
