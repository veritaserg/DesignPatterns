package com.sergeev.structural.Proxy;

public class ProxyApp {
    public static void main(String[] args) {
        Image image = new ProxyImage("c:addda");
        image.display();
    }
}
