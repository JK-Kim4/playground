package com.jongwan.spring.chap06;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client {

    private String host;

    public void setHost(String host) {
        this.host = host;
    }

    public void send(){
        System.out.printf("Client send to host: %s\n", host);
    }


    public void connect() throws Exception {
        System.out.println("Client afterPropertiesSet");
    }
}
