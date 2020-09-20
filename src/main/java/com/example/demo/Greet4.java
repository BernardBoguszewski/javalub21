package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class Greet4 {
    public String greet4(String name) {
        name = StringUtils.reverse(name);
        name = StringUtils.replace(name,","," i ",1);
        name = StringUtils.reverse(name);
        name = StringUtils.replace(name,",",", ",1);
        return name;
    }
}

