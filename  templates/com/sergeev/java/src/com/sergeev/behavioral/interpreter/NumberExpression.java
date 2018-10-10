package com.sergeev.behavioral.interpreter;

class NumberExpression implements Expression{
    int number;
    public NumberExpression(int number) {
        this.number = number;
    }
    public int interpret() {
                return number;
    }


}

