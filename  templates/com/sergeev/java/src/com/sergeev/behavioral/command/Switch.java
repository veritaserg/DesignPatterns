package com.sergeev.behavioral.command;

class Switch {
    Command newOn;
    Command newOff;

    public Switch(Command newOn, Command newOff) {
        this.newOn = newOn;
        this.newOff = newOff;
    }

    void newOnLight() {
        newOn.execut();
    }


    void newOffLight() {
        newOff.execut();
    }
}
