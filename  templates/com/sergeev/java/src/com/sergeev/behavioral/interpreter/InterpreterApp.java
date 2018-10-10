package com.sergeev.behavioral.interpreter;

public class InterpreterApp {
    public static void main(String[] args) {
        Expression sum = getSum();
        Expression minus = getMinus();
        System.out.println(sum.interpret());
        System.out.println(minus.interpret());

    }
        public static Expression getSum () {
            Expression number = new NumberExpression(10);
            Expression number2 = new NumberExpression(20);
            return new PlusExpression(number,number2);
        }
    public static Expression getMinus () {
        Expression number = new NumberExpression(100);
        Expression number2 = new NumberExpression(20);
        return new MinusExpression(number,number2);
    }



}
