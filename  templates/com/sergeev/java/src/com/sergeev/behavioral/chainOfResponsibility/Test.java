package com.sergeev.behavioral.chainOfResponsibility;

class Test{
    public static void main(String[] args) {
        Loger loger,loger1;
        loger  = new EmailLogger(Loger.ERR);
        loger1 =  loger.setNext(new StdoutLogger(Loger.DEBUG));
        loger.messege(" У нас вирус",Loger.ERR);
        loger.messege(" Только дэбаг",Loger.DEBUG);
        loger1.messege(" ERROR",Loger.ERR);

    }}
