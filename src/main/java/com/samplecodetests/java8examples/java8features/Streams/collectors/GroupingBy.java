package com.samplecodetests.java8examples.java8features.Streams.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {

        String [] numbers = {"One", "Two", "Three", "One", "Four", "Three"};
//        List<String> numbersList = List.of(numbers);
        List<String> list = Arrays.asList(numbers);

        System.out.println("original List - " + list);

        Long numberOfElementsInList = list.stream()
                .collect(Collectors.counting());

        System.out.println("Number Of Elements In List = " + numberOfElementsInList);

        // GroupBy with
        // classifier (element selection)
        Map<String, List<String>> stringListMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity()));

        System.out.println(stringListMap);

        // GroupBy with
        // classifier (element selection)
        // downstream - Collectors operation
        Map<String, List<String>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.toList()));

        System.out.println(collect1);


        // GroupBy with
        // classifier (element selection)
        // MapFactory - which Map to use for creating the map
        // downstream - Collectors operation

        //LinkedHashMap maintains insert ordering
        HashMap<String, Long> collect2 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect2);

    }
}
