package com.study.spring5.step04.target;


import org.springframework.stereotype.Component;

@Component
public class SampleTarget {

    public void sampleTargetPrint(){
        System.out.println("hello this is sample target: " + System.nanoTime());
    }
}
