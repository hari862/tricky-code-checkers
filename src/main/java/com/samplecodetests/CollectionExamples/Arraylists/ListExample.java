package com.samplecodetests.CollectionExamples.Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // List is basically initialized with child class instance of ArrayList
        // Interface interfaceReference = new ChildClass();
        // Arraylist extends AbstractList and implements List iterface
        // public class ArrayList<E> extends AbstractList<E>
        //        implements List<E>, RandomAccess, Cloneable, java.io.Serializable

        List<String> myVisitedCities = new ArrayList<>();

        myVisitedCities.add("Patna");
        myVisitedCities.add("Delhi");
        myVisitedCities.add("Kota");
        myVisitedCities.add("Bangalore");

        System.out.println("Arraylist : " + myVisitedCities);

        // approach 2
        List<String> germanCities = new ArrayList<String>(
            Arrays.asList("Frankfurt", "Berlin", "Cologne")
        );

        System.out.println("German Cities List : " + germanCities);

        // you could use all api methods as implemented in Arraylist
    }

}
