package com.sergeev.behavioral.observer;

class ConsoleObserver implements Observer{
    public void handleEvent(int temp, int presser) {
        System.out.println("Погода изменилась. Температура = " + temp + ", Давление = " + presser +".");
    }
}
