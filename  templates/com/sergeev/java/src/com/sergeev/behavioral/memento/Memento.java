package com.sergeev.behavioral.memento;

public class Memento {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL 1",55000);
        System.out.println(game);
        System.out.println(game.hashCode());

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 3",88888);
        System.out.println(game);
        System.out.println(game.hashCode());
        game.load(file.getSave());
        System.out.println(game);
        System.out.println(game.hashCode());


    }
}
