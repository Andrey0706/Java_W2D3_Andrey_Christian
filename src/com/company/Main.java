package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Vienna");
        cities.add("Graz");
        cities.add("Linz");
        cities.add("Salzburg");
        cities.add("Bregenz");
        cities.add("Dornbirn");

        for(String i : cities){
            System.out.println(i);
        }

        ArrayList<Integer> temperature = new ArrayList<Integer>();
        temperature.add(19);
        temperature.add(17);
        temperature.add(11);
        temperature.add(34);
        temperature.add(23);
        temperature.add(7);

        //for(String i : temperature){
        //    System.out.println(i);
        //}

        //cities.addAll(temperature);

        //for(String i : cities){
        //    System.out.println(i);
        //}
        City[] city_array = new City[cities.size()];
        for (int i = 0; i < cities.size(); i++ ) {
            city_array[i] = new City(cities.get(i), temperature.get(i));
        }
        for (City city : city_array) {
            city.printOut();
        }
    }
}
