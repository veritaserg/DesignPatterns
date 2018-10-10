package com.sergeev.behavioral.state;

public class StateApp {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(new LuxFm());
        radio.play();
        radio.nextStation();
        radio.play();

    }
}
