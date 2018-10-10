package com.sergeev.behavioral.command;

class TurnOffLightCommand implements Command{
    Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execut() {
        light.turnOff();
    }
}