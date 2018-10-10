package com.sergeev.structural.adapter;

class AdapterTollwithSpeak extends Toll implements Speak{
    @Override
    public void say() {
        sayEnglish();
    }
}
