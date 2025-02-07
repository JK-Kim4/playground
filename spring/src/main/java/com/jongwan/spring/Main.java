package com.jongwan.spring;

import com.jongwan.spring.chap03.AppCtx;
import com.jongwan.spring.chap03.ChangePasswordService;
import com.jongwan.spring.chap03.MemberRegisterService;
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

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCtx.class);

        MemberRegisterService memberRegisterService = context.getBean("memberRegisterService", MemberRegisterService.class);
        ChangePasswordService changePasswordService = context.getBean("changePasswordService", ChangePasswordService.class);

        System.out.println("memberDao equals: " + (memberRegisterService.getMemberDao() == changePasswordService.getMemberDao()));
        System.out.println("memberDao equals: " + (memberRegisterService.getMemberDao().equals(changePasswordService.getMemberDao())));

        context.close();

    }
}
