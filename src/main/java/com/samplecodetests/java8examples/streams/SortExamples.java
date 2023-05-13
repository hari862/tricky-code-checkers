package com.samplecodetests.java8examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortExamples {

    public static void main(String[] args) {
        String [] names = {"Hari", "Rahul", "Vinod", "Mithun", "Aakash", "Sunil"};

        String sortedInIncreasingOrder = Arrays.stream(names)
                .sorted()
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println("Increasing order sorted - " + sortedInIncreasingOrder);

        String sortedInDescendingOrder = Arrays.stream(names)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", ", "{", "}"));

        System.out.println("Descending order sorted - " + sortedInDescendingOrder);
    }



}
