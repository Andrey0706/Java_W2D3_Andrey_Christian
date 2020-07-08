package com.company;

public class Bicycle extends Vehicle{
    String tires_type;
    public Bicycle(String brand, String model, int number_of_wheels, int max_speed, String tires_type) {
        super(brand, model, number_of_wheels, max_speed);
        this.tires_type =tires_type;
    }

    public String toString (){
        return brand + " " + model + " " + number_of_wheels + " " + max_speed + " " + tires_type;
    }
}
