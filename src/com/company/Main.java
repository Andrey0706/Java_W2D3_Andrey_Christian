package com.company;

import java.util.ArrayList;
import java.util.Collections;

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

        Collections.sort(cities);
        for(String i : cities){
            System.out.println(i);
        }

        ArrayList<String> villages = new ArrayList<String>();
        villages.add("Viennadorf");
        villages.add("Grazdorf");
        villages.add("Linzdorf");

        cities.addAll(villages);

        System.out.println(cities); // 1st method
        cities.remove(6);
        System.out.println("deleting 7th element");
        System.out.println(cities); // 1st method
        System.out.println(cities.indexOf("Grazdorf"));

        System.out.println("\n\n\n\n\nA3");
        System.out.println("before");
        System.out.println(cities);
        updateElement(cities, "Linz", "Wr. Neustadt");
        System.out.println("after");
        System.out.println(cities);
        cities.remove(3);
        System.out.println("before sorting");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println("reverse sorting ...");
        Collections.sort(cities,Collections.reverseOrder());
        System.out.println("after sorting");
        System.out.println(cities);


        ArrayList<City2> federal_states = new ArrayList<City2>();
        federal_states.add(new City2("Niederosterreich", 100000));
        federal_states.add(new City2("Wien", 2000000));
        federal_states.add(new City2("Burgenland", 1952222));
        federal_states.add(new City2("Tirol", 231566));
        federal_states.add(new City2("Voralberg", 56000));
        federal_states.add(new City2("Oberosterreich", 100000));
        federal_states.add(new City2("Steiermark", 100000));
        federal_states.add(new City2("Kartner", 26000));
        federal_states.add(new City2("Salzburg", 150000));

        for(City2 obj : federal_states){
            System.out.println(obj.name + obj.inhabitants);
        }



    }
    public static void updateElement(ArrayList al, String find, String replacement) {
        int index = al.indexOf(find);
        al.set(index, replacement);
    }

}
