package com.sergeev.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Troop {
    List<Soldier> soldiers = new ArrayList<>();
     public  void addSoldie(Soldier soldier){
         soldiers.add(soldier);
     }
     public void removeSoldie(Soldier soldier){
         soldiers.remove(soldier);
     }
     public void createSoldier(){
         for (Soldier soldier:soldiers){
             soldier.specification();
         }
     }

}
