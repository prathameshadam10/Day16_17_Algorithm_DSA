package com.bridgelabz.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class ExtendPrimeToPalidromAnagram {
    List<Integer> primeList = new ArrayList<>();
    public void prime() {
        System.out.println("Prime Numbers Between 0 t0 1000....");


        for (int num = 2; num <= 1000; num++) {
            int count = 0;
            for (int j = 2; j <= num - 1; j++) {
                if (num % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println(num);
                primeList.add(num);
            }

        }

        System.out.println("List Of Elements" + primeList);
    }

    public void palindrome(int n){
        int copyOfn = n;
        int sum = 0;
        while (n!=0){
            int rem = n % 10;
            sum = 10* sum + rem;
            n = n / 10;
        }
        if(sum == copyOfn){
            System.out.println("Prime & Palindrome :" + copyOfn);
        }

    }


    public static void main(String[] args) {
        ExtendPrimeToPalidromAnagram palidromAnagram = new ExtendPrimeToPalidromAnagram();
        palidromAnagram.prime();
        for (int i=0; i < palidromAnagram.primeList.size(); i++ ){
            palidromAnagram.palindrome(palidromAnagram.primeList.get(i));
        }
    }

}
