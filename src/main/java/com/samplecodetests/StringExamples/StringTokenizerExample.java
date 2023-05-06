package com.samplecodetests.StringExamples;

import java.util.*;
public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "I love my country";

        StringTokenizer tokenizer = new StringTokenizer(text);
        // default splitting of space, tab, newline etc

        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }


        String text2 = "This is printed using StringTokenizer with asIterator method";
        tokenizer = new StringTokenizer(text2);

        Iterator<Object> itr = tokenizer.asIterator();
        itr.forEachRemaining(System.out::println);
    }
}

