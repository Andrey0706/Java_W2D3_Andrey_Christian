package com.company;

import java.security.PublicKey;

public class City2 {
    String federal_state, capital;
    int citizens;

    public City2(String federal_state, String capital, int citizens){
        this.federal_state = federal_state;
        this.capital = capital;
        this.citizens = citizens;
    }
    public String getCity(){
        return capital;
    }
    public String getFederalState(){
        return federal_state;
    }
    public int getCitizens(){
        return citizens;
    }
    public String toString() {
        return "The federal state of " + federal_state + " has capital " + capital;
    }
}
