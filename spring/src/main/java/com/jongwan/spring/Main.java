package com.jongwan.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greeting("스프링");
        System.out.println(msg);
        ctx.close();

    }
}
