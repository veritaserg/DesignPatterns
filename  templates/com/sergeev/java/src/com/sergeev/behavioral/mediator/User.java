package com.sergeev.behavioral.mediator;

public abstract class User {
    Chat chat;
    String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void sendMesege(String masege) {
        chat.sendMesege(masege, this);
    }

    abstract void getMesege(String massege);
}
