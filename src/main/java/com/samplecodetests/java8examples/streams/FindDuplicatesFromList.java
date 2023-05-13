package com.samplecodetests.java8examples.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesFromList {
    public static void main(String[] args) {

        String [] numbers = {"One", "Two", "Three", "One", "Four", "Three", "One"};
//        List<String> numbersList = List.of(numbers);
        List<String> list = Arrays.asList(numbers);

        System.out.println("original List - " + list);

        // using set.add(..) in filter to find the duplicates data
        Set<String> stringSet1 = new HashSet<>();
        List<String> stringList = list.stream()
                .filter(num -> !stringSet1.add(num))
                .toList();

        System.out.println("duplicate entries - " + stringList);


        // If we want to print the duplicate entries along with their number of counts:

        Map<String, Long> duplicateDataWithCount = list.stream()
                .filter(num -> Collections.frequency(list, num) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(duplicateDataWithCount);

    }
}
