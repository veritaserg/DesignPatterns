package com.sergeev.behavioral.command;

class TurnOnLightCommand implements Command{
    Light light;
    public TurnOnLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execut() {
        light.turnOn();
    }
}