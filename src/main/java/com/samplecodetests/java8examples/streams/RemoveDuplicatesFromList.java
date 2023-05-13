package com.samplecodetests.java8examples.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {

        String [] numbers = {"One", "Two", "Three", "One"};
//        List<String> numbersList = List.of(numbers);
        List<String> list = Arrays.asList(numbers);

        System.out.println(list);

        //List converted to Set and hence duplicates removed
        Set<String> stringSet = list.stream()
                .collect(Collectors.toSet());

        System.out.println(stringSet);

        // using set.add(..) in filter to find the duplicates data
        Set<String> stringSet1 = new HashSet<>();
        List<String> stringList = list.stream()
                .filter(num -> !stringSet1.add(num))
                .toList();

        System.out.println(stringList);

        // using stream().distinct
        List<String> stringList1 = list.stream()
                .distinct()
                .toList();
        System.out.println(stringList1);

    }
}
