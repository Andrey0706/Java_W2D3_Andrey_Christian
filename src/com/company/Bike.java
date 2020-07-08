package com.company;

public class Bike extends Vehicle{
    String type;
    public Bike(String brand, String model, int number_of_wheels, int max_speed, String type) {
        super(brand, model, number_of_wheels, max_speed);
        this.type = type;
    }
    public String toString (){
        return brand + " " + model + " " + number_of_wheels + " " + max_speed + " " + type;
    }
}
