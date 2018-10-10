package com.sergeev.structural.decorator;

public class RunFile {
    public static void main(String[] args) {
        File file = new FileZip(new FileBuffer(new FileReader()));
        System.out.println(file.jobFaile());
    }

}
