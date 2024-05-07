package com.study.spring5.step04;

import com.study.spring5.step04.target.SampleTarget;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
public class AspectTutorialApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        SampleTarget sampleTarget1 = new SampleTarget();
        SampleTarget sampleTarget2 = ctx.getBean("sampleTarget", SampleTarget.class);

        sampleTarget1.sampleTargetPrint(); // app context 내 singleton 인스턴스가 아니기 때문에 Aspect 적용되지 않음
        sampleTarget2.sampleTargetPrint(); // app context 내 인스턴스를 호출하여 사용하기 때문에 Aspect 적용

        ctx.close();

    }
}
