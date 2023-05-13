package com.samplecodetests.StringExamples;

// asked in a hackerRank Code Test
public class StringReverse {
    public static void main(String[] args) {
        String name = "Hari Shankar";

        char[] chars = name.toCharArray();
        System.out.println(chars);


        char temp ;
        for(int left = 0, right = chars.length - 1; left<right; left++, right--) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        String reversedName = new String(chars);
        System.out.println(reversedName);

        // StringBuilder sb = new StringBuilder(); also allowed
        StringBuilder sb = new StringBuilder(name);
        String reversedName2 = sb.reverse().toString();
        System.out.println(reversedName2);



    }
}
