package com.sergeev.behavioral.mediator;

public class MediatorAPP {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User a = new SimpleUser(chat, "Vova");
        User b = new SimpleUser(chat, "Vova2");
        User c = new SimpleUser(chat, "Vova3");
        chat.addUser(a);
        chat.addUser(b);
        chat.addUser(c);
        a.sendMesege("hello");


    }
}
