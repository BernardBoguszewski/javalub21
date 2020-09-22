package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class Greet5 {
    public String greet5(String name) {
        name = StringUtils.reverse(name);
        name = StringUtils.replace(name,","," i ",1);
        name = StringUtils.reverse(name);
        name = StringUtils.replace(name,",",", ",1);
        return name+", witajcie!";
    }
}

