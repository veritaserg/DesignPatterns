package com.sergeev.structural.Proxy;

class RealImege implements Image {
    String image;

    public RealImege(String image) {
        this.image = image;
        load();
    }

    void load() {
        System.out.println("Загрузка " + image);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + image);
    }
}
