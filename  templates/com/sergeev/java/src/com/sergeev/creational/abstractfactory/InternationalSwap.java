package com.sergeev.creational.abstractfactory;

import com.sergeev.creational.abstractfactory.english.EnglishCommandFactory;
import com.sergeev.creational.abstractfactory.russian.RussianCommandFactory;

public class InternationalSwap {
    public static void main(String[] args) {

     //   CommandFactory commandFactory = new RussianCommandFactory();
        CommandFactory commandFactory = new EnglishCommandFactory();
        Scout scout = commandFactory.getScout();
        Sniper sniper = commandFactory.getSniper();
        Soldier soldier = commandFactory.getSoldier();

scout.scout();
sniper.sniper();
soldier.soldier();






    }
}