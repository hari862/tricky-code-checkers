package com.samplecodetests.CollectionExamples.Arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterators {

    public static void main(String[] args) {

        ArrayList<String> myVisitedCities = new ArrayList<>();

        myVisitedCities.add("Patna");
        myVisitedCities.add("Delhi");
        myVisitedCities.add("Kota");
        myVisitedCities.add("Bangalore");

        System.out.println("Deafult display for Arraylist : " + myVisitedCities);

        System.out.println("----------");

        // display using java 8 iterator -> sysout individually
        Iterator<String> cityIterator = myVisitedCities.iterator();
        cityIterator.forEachRemaining(System.out::println);

        System.out.println("----------");

        //forEach with 2 Consumer lambdas
        myVisitedCities.forEach(s -> System.out.println(s));
        //myVisitedCities.forEach(System.out::println);

        System.out.println("----------");

        // traditional For loop
        for (String s : myVisitedCities) {
            System.out.println(s);
        }

    }

}
