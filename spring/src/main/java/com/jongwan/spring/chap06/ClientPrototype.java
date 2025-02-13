package com.jongwan.spring.chap06;

public class ClientPrototype {

    private String host;

    public void setHost(String host) {
        this.host = host;
    }

    public void send(){
        System.out.printf("Client send to host: %s\n", host);
    }


    public void close() throws Exception {
        System.out.println("Client destroy");
    }


    public void connect() throws Exception {
        System.out.println("Client afterPropertiesSet");
    }
}
