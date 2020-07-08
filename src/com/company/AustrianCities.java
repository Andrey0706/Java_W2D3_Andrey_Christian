package com.company;

import java.util.ArrayList;

public class AustrianCities {
    ArrayList<City2> arrayList;
    AustrianCities(ArrayList<City2> arrayList) {
        this.arrayList = arrayList;
    }

    public void printCityNames() {
        for (City2 city : arrayList) {
            System.out.println(city.getCity());
        }
    }
    public void printCityCitizenNumbers() {
        for (City2 city : arrayList) {
            System.out.println(city.getCitizens());
        }
    }
    public void printAllCityData() {
        for (City2 city : arrayList) {
            System.out.println(city.getCity() + " has a population of " + city.getCitizens());
        }
    }
    public void printTotalNumberOfCitizens() {
        int sum = 0;
        for (City2 city : arrayList) {
            System.out.println(city.getCity() + " has a population of " + city.getCitizens());
            sum += city.getCitizens();
        }
        System.out.println("===========");
        System.out.println("TOTAL " + sum);
    }
}
