package org.lucksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application/application.properties")
@ComponentScan("org.lucksoft.services")
public class ApplicationConfig {
}
