package com.jongwan.spring.chap07;

public class ImpeCalculator implements Calculator {

    @Override
    public long factorial(long number) {
        long result = 1;
        for(long i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
