package com.sergeev.behavioral.interpreter;

class MinusExpression implements Expression{
    Expression left;
    Expression right;
    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}