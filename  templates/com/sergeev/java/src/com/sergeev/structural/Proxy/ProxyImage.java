package com.sergeev.structural.Proxy;

class ProxyImage implements Image {
    String image;
    RealImege jpg;

    public ProxyImage(String image) {
        this.image = image;
    }

    @Override
    public void display() {
        if (jpg == null) {
            jpg = new RealImege(image);
        }
        jpg.display();
    }
}