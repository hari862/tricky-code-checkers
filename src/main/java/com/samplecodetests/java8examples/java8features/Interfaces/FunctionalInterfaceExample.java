package com.samplecodetests.java8examples.java8features.Interfaces;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        SAMInterface sam = ((s1, s2) -> s1.equalsIgnoreCase(s2));
        boolean testResult = sam.testTwoStringsForEquality("Hari", "HARI");

        System.out.println("Strings are equal? " + testResult);
    }

}

@FunctionalInterface
interface SAMInterface {
    boolean testTwoStringsForEquality(String s1, String s2);
}
