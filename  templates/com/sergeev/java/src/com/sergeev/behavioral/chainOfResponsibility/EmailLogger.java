package com.sergeev.behavioral.chainOfResponsibility;

class EmailLogger extends Loger{
    public EmailLogger(int prior) {
        this.prioritetLogg = prior;
    }

    @Override
    protected void writeMessegi(String msg) {
        System.out.println("Send to Email" + msg);
    }
}
