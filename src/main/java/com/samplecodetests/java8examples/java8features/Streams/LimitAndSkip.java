package com.samplecodetests.java8examples.java8features.Streams;

import java.util.List;
import java.util.stream.Stream;

public class LimitAndSkip {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(0, 1, 2, 3, 4, 5, 6);

        List<Integer> integerList = integerStream.limit(4)
                .toList();

        System.out.println("Limits based List of integers = " + integerList);

        // You can't process integerStream. ... operations since it is already been closed
        // and will throw illegalStateExecption if tried. Hence initialize it again.
        System.out.println("Output with skip(4)");
        integerStream = Stream.of(0, 1, 2, 3, 4, 5, 6);
        integerStream.skip(4)
                .forEach(System.out::println);
    }
}
