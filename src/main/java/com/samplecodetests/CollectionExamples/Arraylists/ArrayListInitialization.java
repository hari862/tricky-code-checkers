package com.samplecodetests.CollectionExamples.Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListInitialization {

    public static void main(String[] args) {

        ArrayList<String> myVisitedCities = new ArrayList<>();

        myVisitedCities.add("Patna");
        myVisitedCities.add("Delhi");
        myVisitedCities.add("Kota");
        myVisitedCities.add("Bangalore");

        System.out.println("Arraylist : " + myVisitedCities);

        // approach 2
        ArrayList<String> germanCities = new ArrayList<String>(
            Arrays.asList("Frankfurt", "Berlin", "Cologne")
        );

        System.out.println("German Cities List : " + germanCities);
    }

}
