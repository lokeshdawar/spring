package org.lucksoft.app;

import org.lucksoft.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello Fruzenshtein!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cntx = new AnnotationConfigApplicationContext("org.lucksoft");
        UserService uService = (UserService) cntx.getBean("userService");
        uService.sayHello(2);
        uService.sayHello(1);
    }
}
