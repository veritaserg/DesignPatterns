package com.sergeev.creational.factory;

public class Program {

    public static void main(String[] args) {
LangFactori langFactori = getLang("EN");
Language language = langFactori.createLang();
language.speak();


    }

    public static LangFactori getLang(String translator) throws RuntimeException {
        switch (translator){
            case "EN":
                return new EnglishLanguagFactori();
            case "RU":
                return new RussiaLanguagFactori();

            default:
                throw new RuntimeException();
        }

    }

}
