package com.sergeev.behavioral.chainOfResponsibility;

public abstract class Loger {
    public static int ERR = 1;
    public static  int DEBUG = 2;
    public static  int INFO = 3;
    protected  int prioritetLogg;
    protected Loger next;

    public Loger setNext(Loger next) {
        this.next = next;
        return next;
    }

    public void messege(String msg,int prioriti){
        if (prioriti <=prioritetLogg){
            writeMessegi(msg);
        }
        if (next!=null){
            next.messege(msg, prioriti);

        }

    }
    abstract protected void writeMessegi(String msg);
}