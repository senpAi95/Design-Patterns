package com.designpatterns.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while(stringTokenizer.hasMoreElements()) {
            String test = stringTokenizer.nextToken();
            if(test.equals(data))
                return true;
        }
        return false;
    }
}
