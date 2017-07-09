package org.lucksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@PropertySource("classpath:web/web.properties")
@EnableWebMvc
@ComponentScan("org.lucksoft.web")
public class WebConfig {
}
