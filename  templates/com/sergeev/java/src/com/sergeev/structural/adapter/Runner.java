package com.sergeev.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Speak speak = new AdapterTollwithSpeak();
        speak.say();
    }
}
