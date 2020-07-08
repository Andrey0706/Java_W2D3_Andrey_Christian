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

        federal_states.add(new City2("Niederosterreich", "St POlten", 435435));
        federal_states.add(new City2("Wien", "Wien",2321321));
        federal_states.add(new City2("Burgenland", "Eisenstadt",213213));
        federal_states.add(new City2("Tirol", "Insbruck",23213213));
        federal_states.add(new City2("Voralberg", "Bregenz",34343));
        federal_states.add(new City2("Oberosterreich", "Linz",21321321));
        federal_states.add(new City2("Steiermark", "Graz",12321321));
        federal_states.add(new City2("Kartner", "Klagenfurt",213213));
        federal_states.add(new City2("Salzburg", "Salzburg",123213));


        for(City2 obj : federal_states){
            System.out.println(obj);
        }
        AustrianCities ac = new AustrianCities(federal_states);
        seperator();
        ac.printCityNames();
        seperator();
        ac.printCityCitizenNumbers();
        seperator();
        ac.printAllCityData();
        seperator();
        ac.printTotalNumberOfCitizens();
        seperator();
        System.out.println("Sorting by citizens number ascending");
        System.out.println(federal_states);
        Collections.sort(federal_states, new SortByCitizensAsc());
        System.out.println(federal_states);
        System.out.println("Sorting by citizens number descending");
        Collections.sort(federal_states, new SortByCitizensDesc());
        System.out.println(federal_states);
        System.out.println("Sorting by cityname number ascending");
        Collections.sort(federal_states, new SortByCityAsc());
        System.out.println(federal_states);
        System.out.println("Sorting by cityname number descending");
        Collections.sort(federal_states, new SortByCityDesc());
        System.out.println(federal_states);

    }
    public static void updateElement(ArrayList al, String find, String replacement) {
        int index = al.indexOf(find);
        al.set(index, replacement);
    }
    public static void seperator() {
        System.out.println("\n\n#########################################\n\n");
    }

}
