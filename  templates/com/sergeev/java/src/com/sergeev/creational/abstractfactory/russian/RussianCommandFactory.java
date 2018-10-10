package com.sergeev.creational.abstractfactory.russian;

import com.sergeev.creational.abstractfactory.CommandFactory;
import com.sergeev.creational.abstractfactory.Scout;
import com.sergeev.creational.abstractfactory.Sniper;
import com.sergeev.creational.abstractfactory.Soldier;

public class RussianCommandFactory implements CommandFactory {
    @Override
    public Scout getScout() {
        return new RussianScout();
    }

    @Override
    public Sniper getSniper() {
        return new RussianSniper();
    }

    @Override
    public Soldier getSoldier() {
        return new RussianSoldier();
    }
}
