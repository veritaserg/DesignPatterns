package com.sergeev.structural.decorator;

public class FileZip extends FileDecorator {
    public FileZip(File file) {
        super(file);
    }

    String addZip() {
        return ", архивируем файл.....";
    }

    @Override
    public String jobFaile() {
        return super.jobFaile() + addZip();
    }
}
