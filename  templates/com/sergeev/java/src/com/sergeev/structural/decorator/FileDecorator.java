package com.sergeev.structural.decorator;

public class FileDecorator implements File {
    File file;

    public FileDecorator(File file) {
        this.file = file;
    }

    @Override
    public String jobFaile() {
        return file.jobFaile();

    }
}
