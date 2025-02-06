package com.jongwan.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

        Greeter g1 = ctx.getBean("gtr", Greeter.class);
        Greeter g2 = ctx.getBean("gtr", Greeter.class);
        System.out.println("(g1 == g2): " + (g1 == g2));
        System.out.println("(g1 == g2): " + g1.equals(g2));
        ctx.close();

    }
}
