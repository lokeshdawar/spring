package org.lucksoft.app;

import org.lucksoft.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello Fruzenshtein!
 *
 */
public class WebApp 
{
	
	private static final Logger logger = LoggerFactory.getLogger(WebApp.class.getName());
    public static void main( String[] args )
    {
    	logger.info("Getting Application Context");
        ApplicationContext cntx = new AnnotationConfigApplicationContext("org.lucksoft.config");
        logger.info("Getting service Interface");
        UserService uService = (UserService) cntx.getBean("userService");
        logger.info("Doing Service call....");
        uService.sayHello(2);
        uService.sayHello(1);
        logger.info("Done.......|||");
    }
}
