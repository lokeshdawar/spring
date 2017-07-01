package com.lucksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.lucksoft.hello.HelloWorld;
import com.lucksoft.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {

    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

}