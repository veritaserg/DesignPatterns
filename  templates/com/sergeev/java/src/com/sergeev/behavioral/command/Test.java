package com.sergeev.behavioral.command;

class Test{
    public static void main(String[] args) {
        Light light = new Light();
        Switch s = new Switch(new TurnOnLightCommand(light),new TurnOffLightCommand(light));
        s.newOnLight();
        s.newOffLight();

    }
}
