package com.sergeev.behavioral.interpreter;

class PlusExpression implements Expression{
    Expression left;
    Expression right;
    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public int interpret() {
        return left.interpret() + right.interpret();
    }

}
