package com.samplecodetests.CollectionExamples.Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListAPIs {

    public static void main(String[] args) {

        ArrayList<String> myVisitedCities = new ArrayList<>();

        myVisitedCities.add("Patna");
        myVisitedCities.add("Delhi");
        myVisitedCities.add("Kota");
        myVisitedCities.add("Bangalore");

        System.out.println("Arraylist = " + myVisitedCities);

        // available methods:
        myVisitedCities.add(2, "Hyderabad");

        List<String> germanCities = Arrays.asList("Frankfurt", "Berlin", "Cologne");
        myVisitedCities.addAll(germanCities);

        System.out.println(myVisitedCities);

        myVisitedCities.remove("Kota");

        System.out.println(myVisitedCities);
        boolean isPatnaRemoved = myVisitedCities.removeIf(s -> s.equals("Patna"));

        System.out.println("Is Patna Removed ? " + (isPatnaRemoved?"Yes":"No"));
        System.out.println(myVisitedCities);

        System.out.println("converting to uppercase");

        // used replaceALl for the same later
        myVisitedCities.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Does the list contain Delhi"
                + (myVisitedCities.contains(("Delhi"))?"Yes":"No"));

        myVisitedCities.replaceAll(s -> s.toLowerCase());

        System.out.println("Sorting with lexicography style");
        myVisitedCities.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(myVisitedCities);

        String allCitiesCapitalized = myVisitedCities.stream()
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1))
                .reduce((s1, s2) -> s1 + ", " + s2)
                .get();


        System.out.println(allCitiesCapitalized);

        String collectorJoiningString = myVisitedCities.stream()
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println("collectors joining operation "+ collectorJoiningString);



    }

    private static void displayTheArrayList(ArrayList<String> myVisitedCities) {
        Iterator<String> cityIterator = myVisitedCities.iterator();

        // iterate using Java 8
        cityIterator.forEachRemaining(System.out::println);

        System.out.println("-------------");
    }
}
