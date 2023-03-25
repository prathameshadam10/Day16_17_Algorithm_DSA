package com.bridgelabz.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String....");
        String str1 = sc.next().toLowerCase();
        System.out.println("Enter Second String....");
        String str2 = sc.next().toLowerCase();
//        Compare String Size
        if (str1.length() == str2.length()) {
//            Convert Strings to Array
            char char1[] = str1.toCharArray();
            char char2[] = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            String sorted1 = new String(char1);
            String sorted2 = new String(char2);

            if (sorted1.equals(sorted2)) {
                System.out.println("String is Anagram");
            } else
                System.out.println("String is not Anagram");

        }
    }
}





