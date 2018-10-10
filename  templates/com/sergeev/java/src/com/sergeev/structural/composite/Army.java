package com.sergeev.structural.composite;




public class Army {
    public static void main(String[] args) {
        Troop troop = new Troop();
        Soldier archer = new Archer();
        Soldier pihote = new Pihota();
        Soldier horse = new Horse();
troop.addSoldie(archer);
troop.addSoldie(pihote);
troop.addSoldie(horse);
troop.createSoldier();


    }

}
