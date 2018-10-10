package com.sergeev.creational.factory;

public class RussiaLanguagFactori implements LangFactori {
    @Override
    public Language createLang() {
        return new Russia();
    }
}
