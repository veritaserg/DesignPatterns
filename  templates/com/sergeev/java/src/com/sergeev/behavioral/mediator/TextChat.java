package com.sergeev.behavioral.mediator;


import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat {

    List<User> users = new ArrayList<>();

    @Override
    public void sendMesege(String mesege, User user) {
        for (User u : users) {
            if (u != user)
                u.getMesege(user.getName() + ": " + mesege);
        }
    }
    public void addUser(User u) {
        users.add(u);
    }
}
