package com.jongwan.spring.chap07;


public class RecCalculator implements Calculator {

    @Override
    public long factorial(long number) {
        if(number == 0) return 1;
        else return number * factorial(number - 1);


    }
}
