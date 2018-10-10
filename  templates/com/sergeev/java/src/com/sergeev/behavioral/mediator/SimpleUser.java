package com.sergeev.behavioral.mediator;


class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    void getMesege(String message) {
        System.out.println("Пользователь " + getName() + " получает сообщение '" + message + "'");
    }
}