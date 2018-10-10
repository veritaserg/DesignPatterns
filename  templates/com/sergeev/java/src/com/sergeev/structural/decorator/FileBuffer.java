package com.sergeev.structural.decorator;

public class FileBuffer extends FileDecorator {
    public FileBuffer(File file) {
        super(file);
    }

    @Override
    public String jobFaile() {
        return super.jobFaile() + ", прогоняем через буфер";
    }
}
