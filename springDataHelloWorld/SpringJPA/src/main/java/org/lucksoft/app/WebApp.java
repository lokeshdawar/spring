package org.lucksoft.app;

import org.lucksoft.config.ApplicationConfig;
import org.lucksoft.config.DBConfig;
import org.lucksoft.config.WebConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * Hello Fruzenshtein!
 *
 */
@SpringBootApplication
@Import(value={DBConfig.class, ApplicationConfig.class, WebConfig.class})
public class WebApp extends SpringBootServletInitializer
{
	private static final Logger logger = LoggerFactory.getLogger(WebApp.class.getName());
    public static void main( String[] args )
    {
    	logger.info("Getting WebApplication Context");
    	SpringApplication.run(WebApp.class, args);
        
    }
}
