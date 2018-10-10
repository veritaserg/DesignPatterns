package com.sergeev.behavioral.state;

public class Radio {
    Station station;

    public void setStation(Station station) {
        this.station = station;
    }
    void nextStation(){
        if(station instanceof LuxFm){
            setStation(new KissFM());
        }else if (station instanceof KissFM){
            setStation(new LuxFm());
        }

    }

    void play(){
        station.play();
    }
}