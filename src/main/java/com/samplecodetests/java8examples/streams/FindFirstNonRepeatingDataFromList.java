package com.samplecodetests.java8examples.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingDataFromList {
    public static void main(String[] args) {

        String [] numbers = {"One", "Two", "Three", "One", "Four", "Three"};
//        List<String> numbersList = List.of(numbers);
        List<String> list = Arrays.asList(numbers);

        System.out.println("original List - " + list);

        // Hence we need to create a temporary map which will have
        // key = data and value = count i.e. number of occurrences using group by
        // after map creation filter for all the map entries with count = 1 and then findFirst
        list.stream()
                //.peek(s -> System.out.print(s + " "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .findFirst()
                .map(entry -> entry.getKey())
                .ifPresent(System.out::println);

        System.out.println("Below code outputs are for gradual learning by dividing the above working code to smaller code snippets");
        // Below code is for gradual learning by dividing the above working code to smaller code snippets

        // Set based impl like set.add(..) or !set.add(..) will not work since
        // set.add() is basically finding distinct data
        // !set.add() is finding duplicate data because for first time entries set.add() will return true
        // and for duplicate entries set.add() will return false.

        // below one doesn't work. since it will have below
        list.stream()               // [One, Two, Three, One, Four, Three]
                .distinct()         // [One, Two, Three, Four]
                .findFirst()        // One
                .ifPresent(System.out::println); // One

        Map<String, List<String>> stringListMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity()));

        System.out.println(stringListMap);

        Long collect = list.stream()
                .collect(Collectors.counting());

        System.out.println(collect);

        Map<String, List<String>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.toList()));

        System.out.println(collect1);

        //Hashmap might give some unusual ordering output
        HashMap<String, Long> collect2 = list.stream()
                .peek(s -> System.out.print(s + " "))
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        System.out.println(collect2);

        //LinkedHashMap Java Docs - Hash table and linked list implementation of the Map interface, with predictable iteration order. This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries. This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order). Note that insertion order is not affected if a key is re-inserted into the map. (A key k is reinserted into a map m if m.put(k, v) is invoked when m.containsKey(k) would return true immediately prior to the invocation.)
        //This implementation spares its clients from the unspecified, generally chaotic ordering provided by HashMap (and Hashtable), without incurring the increased cost associated with TreeMap. It can be used to produce a copy of a map that has the same order as the original, regardless of the original map's implementation:
        HashMap<String, Long> collect3 = list.stream()
                .peek(s -> System.out.print(s + " "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect3);

    }
}
