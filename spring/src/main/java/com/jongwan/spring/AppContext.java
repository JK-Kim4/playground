package com.jongwan.spring;

import com.jongwan.spring.chap06.Client;
import com.jongwan.spring.chap06.ClientPrototype;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {

    @Bean
    public Client client(){
        Client client = new Client();
        client.setHost("hostttt");
        return client;
    }

    @Bean
    @Scope("singleton")
    public ClientPrototype clientPrototype(){
        ClientPrototype clientPrototype = new ClientPrototype();
        clientPrototype.setHost("hostttt12123");
        return clientPrototype;
    }
}
