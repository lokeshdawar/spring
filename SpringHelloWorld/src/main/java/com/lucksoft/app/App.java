package com.lucksoft.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lucksoft.hello.HelloWorld;
import com.lucksoft.model.User;

/**
 * Hello world!
 *
 */
//@Configuration
//@ComponentScan("com.lucksoft.config")
public class App 
{
   @Autowired
    DataSource dataSource;

//    @Autowired
//    UserRepository userRepository;

    public static void main( String[] args )
    {
    	//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	//context.register(App.class);
    	//context.refresh();
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.lucksoft.config");
    	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
 	    obj.printHelloWorld("Spring3 Java Config");
 	    
 	   System.out.println("\n1.findAll()...");
//       for (User user : userRepository.findAll()) {
//           System.out.println(user);
//       }


    }
}
