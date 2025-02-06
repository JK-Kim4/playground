package com.jongwan.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean(name = "greeter")
    public Greeter greeter(){
        Greeter greeter = new Greeter();
        greeter.setFormat("%s 안녕하세요!");
        return greeter;
    }
}
