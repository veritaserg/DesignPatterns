package com.sergeev.behavioral.chainOfResponsibility;

class StdoutLogger extends Loger{
    public StdoutLogger(int prior) {
        this.prioritetLogg = prior;
    }

    @Override
    protected void writeMessegi(String msg) {
        System.out.println("Send to STD" + msg);
    }
}