package com.samplecodetests.java8examples.java8features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Credits - https://www.geeksforgeeks.org/stream-flatmap-java-examples/
public class FlatMapExamples {

    public static void main(String[] args)
    {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);

        System.out.println("Peek before flatmap");
        // Peek before
        listofInts  = listOfListofInts.stream()
                 .peek(System.out::println)
                .flatMap(list -> list.stream())
                 .collect(Collectors.toList());

        System.out.println("Peek before and after flatmap");
        // Peek before
        listofInts  = listOfListofInts.stream()
                .peek(System.out::println)
                .flatMap(list -> list.stream())
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}

