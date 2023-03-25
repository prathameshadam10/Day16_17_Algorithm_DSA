package com.bridgelabz.Algorithm;

public class PrimeNumbers_7 {

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

            }

        }


    }



    public static void main(String[] args) {
        PrimeNumbers_7 primeNumbers7 = new PrimeNumbers_7();
        primeNumbers7.prime();
    }
}