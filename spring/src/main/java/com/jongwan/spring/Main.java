package com.jongwan.spring;

import com.jongwan.spring.chap03.AppCtx;
import com.jongwan.spring.chap03.ChangePasswordService;
import com.jongwan.spring.chap03.MemberRegisterService;
import com.jongwan.spring.chap06.Client;
import com.jongwan.spring.chap06.ClientPrototype;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//
//        Greeter g1 = ctx.getBean("gtr", Greeter.class);
//        Greeter g2 = ctx.getBean("gtr", Greeter.class);
//        System.out.println("(g1 == g2): " + (g1 == g2));
//        System.out.println("(g1 == g2): " + g1.equals(g2));
//        ctx.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        Client client1 = context.getBean(Client.class);
        Client client2 = context.getBean(Client.class);
        System.out.println(" (client1 == client2) = " + (client1 == client2));

        ClientPrototype cp1 = context.getBean(ClientPrototype.class);
        ClientPrototype cp2 = context.getBean(ClientPrototype.class);
        System.out.printf(" (clientPrototype1 == ClientPrototype2) = "+ (cp1 == cp2) );

        context.close();

    }
}
