package com.company;

public class ElectroCar extends Vehicle{
    boolean frontTrunk;
    public ElectroCar(String brand, String model, int number_of_wheels, int max_speed, boolean frontTrunk) {
        super(brand, model, number_of_wheels, max_speed);
        this.frontTrunk = frontTrunk;
    }

    public String toString (){
        return brand + " " + model + " " + number_of_wheels + " " + max_speed + " " + frontTrunk;
    }
}
