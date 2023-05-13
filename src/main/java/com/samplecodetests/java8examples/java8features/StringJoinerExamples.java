package com.samplecodetests.java8examples.java8features;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExamples {

    public static void main(String[] args) {
        ArrayList<String> myVisitedCities = new ArrayList<>();

        myVisitedCities.add("Patna");
        myVisitedCities.add("Delhi");
        myVisitedCities.add("Kota");
        myVisitedCities.add("Bangalore");

        String collectorJoiningString = myVisitedCities.stream()
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(collectorJoiningString);
        //{Patna, Delhi, Kota, Bangalore}


        StringJoiner germanCities = new StringJoiner(" - ");

        germanCities.add("Frankfurt");
        germanCities.add("Cologne");
        germanCities.add("Rudesheim");
        germanCities.add("Berlin");

        System.out.println(germanCities);
        //Frankfurt - Cologne - Rudesheim - Berlin

        StringJoiner spanishCities = new StringJoiner(",", "(", ")");

        spanishCities.add("Barcelona");
        spanishCities.add("Valencia");
        spanishCities.add("Madrid");

        System.out.println(spanishCities);
        //(Barcelona,Valencia,Madrid)


    }
    }
