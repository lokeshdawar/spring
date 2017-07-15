package org.lucksoft.app;

import org.lucksoft.config.ApplicationConfig;
import org.lucksoft.config.DBConfig;
import org.lucksoft.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello Fruzenshtein!
 *
 */
public class App 
{	
	private static final Logger logger = LoggerFactory.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	logger.info("Getting Application Context");
        //ApplicationContext cntx = new AnnotationConfigApplicationContext("org.lucksoft.config");
    	ApplicationContext cntx = new AnnotationConfigApplicationContext(ApplicationConfig.class, DBConfig.class);
        logger.info("Getting service Interface");
        UserService uService = cntx.getBean(UserService.class);
        logger.info("Doing Service call....");
        uService.sayHello(2);
        uService.sayHello(1);
        logger.info("Done.......|||");
    }
}
