package com.samplecodetests.StringExamples;

import java.util.*;
import java.lang.*;

public class Split {

    public static void main(String [] args) {
        String text = "India is my Country and I love India";

        String[] splittedText = text.split(" ");

        printStringArrayContents(splittedText);

        System.out.println("Example 2 with more spaces");
        text = "India    is my  Country and I love India ";

        splittedText = text.split(" ");

        printStringArrayContents(splittedText);

        System.out.println("Example 3 with regex for more spaces");

        text = "India    is my  Country and I love India ";

        splittedText = text.split("\\s+");

        printStringArrayContents(splittedText);

        // split method also has limit as split(regexPattern, limit).
        // limit +n = limit to total n splits
        // limit -n = all possible splits
        // limit 0 = all possible splits and skip trailer blank strings
    }

    private static void printStringArrayContents(String[] splittedText) {
        for(String s: splittedText) {
            System.out.println(s);
        }
    }


}
