package com.sergeev.creational.abstractfactory.english;

import com.sergeev.creational.abstractfactory.CommandFactory;
import com.sergeev.creational.abstractfactory.Scout;
import com.sergeev.creational.abstractfactory.Sniper;
import com.sergeev.creational.abstractfactory.Soldier;

public class EnglishCommandFactory implements CommandFactory {
    @Override
    public Scout getScout() {
        return new EnglishScout();
    }

    @Override
    public Sniper getSniper() {
        return new EnglishSniper();
    }

    @Override
    public Soldier getSoldier() {
        return new EnglishSoldier();
    }
}
