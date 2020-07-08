package com.company;

public class City {
    String city;
    int temperature;
    public City(String city, int temperature) {
        this.city = city;
        this.temperature = temperature;
    }
    void printOut() {
        System.out.println("In " + city + " is temperature of " + temperature + " degerees.");
    }
}
