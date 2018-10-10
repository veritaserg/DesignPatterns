package com.sergeev.creational.factory;

public class EnglishLanguagFactori implements LangFactori{
    @Override
    public Language createLang() {
        return new English();
    }
}
