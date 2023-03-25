package com.bridgelabz.Algorithm;

import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutation(str,"");
    }
    public static void printPermutation(String abc, String xyz){
        if(abc.length()==0){
            System.out.println(xyz);
            return;
        }
        for (int i=0; i<abc.length(); i++){
            char ch = abc.charAt(i);
            String dx = abc.substring(0,i);
            String jdk = abc.substring(i+1);
            String srt = dx + jdk;
            printPermutation(srt,xyz+ch);
        }
    }

}
