package com.jongwan.spring;

public class Greeter {

    private String format;

    public String greeting(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
