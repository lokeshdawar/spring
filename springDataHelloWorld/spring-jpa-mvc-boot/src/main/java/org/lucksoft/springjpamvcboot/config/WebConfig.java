package org.lucksoft.springjpamvcboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@PropertySource("classpath:web.properties")
@EnableWebMvc
@ComponentScan("org.lucksoft.springjpamvcboot.web")
public class WebConfig {
}
