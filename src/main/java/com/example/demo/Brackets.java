package com.example.demo;

import org.springframework.util.StringUtils;

public class Brackets {
    public boolean areClosed(String brackets) {
        if (brackets.startsWith("]")) {
            return false;
        }
        if (brackets.endsWith("[")) {
            return false;
        }
        int open = StringUtils.countOccurrencesOf(brackets, "[");
        int close = StringUtils.countOccurrencesOf(brackets, "]");
        if (open != close) {
            return false;
        }
        char[] chars = brackets.toCharArray();
        int ob = 0; // open brackets
        int cb = 0; // close brackets
        for (Character c : chars) {
            if (c.equals('[')) {
                ob++;
            }
            if (c.equals(']')) {
                cb++;
            }
            if (cb > ob) {
                return false;
            }
        }
        return ob == cb;
    }
}
