package com.sergeev.creational.abstractfactory;

public interface CommandFactory {
    Scout getScout();
    Sniper getSniper();
    Soldier getSoldier();
}
