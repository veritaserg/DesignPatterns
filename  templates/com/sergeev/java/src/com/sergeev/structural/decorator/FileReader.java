package com.sergeev.structural.decorator;

public class FileReader implements File {
    @Override
    public String jobFaile() {
        return "Читаем с файла";
    }
}
