package com.sergeev.behavioral.memento;

public class Save {
    private String level;
    private int ms;
    public Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }
    public String getLevel() {
        return level;
    }
    public int getMs() {
        return ms;
    }
}
