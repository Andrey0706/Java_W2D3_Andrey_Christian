package com.company;

public class Car extends Vehicle{
    boolean aircondition;
    public Car(String brand, String model, int number_of_wheels, int max_speed, boolean aircondition) {
        super(brand, model, number_of_wheels, max_speed);
        this.aircondition = aircondition;
    }
    public String toString (){
        return brand + " " + model + " " + number_of_wheels + " " + max_speed + " " + aircondition;
    }
}
