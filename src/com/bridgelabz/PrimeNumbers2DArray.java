package com.bridgelabz;

public class PrimeNumbers2DArray {
    public static void main(String[] args) {


//    Initialize 2D array to store prime numbers
        int[][] primeNumbers = new int[10][];

//    loop through each range of prime numbers
        int start = 0;
        int end = 100;
        for(int i = 0; i < 10; i++){
//            call a method to get the prime numbers in the current range
            primeNumbers[i] = getPrimeInRange(start,end);
//            update the start and end values for the next range
            start = end + 1;
            end += 100;
        }
//        Print out prime numbers in each range
        for(int i = 0; i < 10; i++){
            System.out.println("Primes between " + ((i * 100) + 1) + " and " + ((i+1) * 100) + " :");
            for(int j = 0; j < primeNumbers[i].length; j++){
                System.out.println(primeNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
//        method to get the prime numbers in each range
    private static int[] getPrimeInRange(int start, int end) {
//        create an array to store the prime numbers
        int [] primes = new int[end - start + 1];
        int index = 0;

        //  Loop through each number in the range
        for (int i = start; i <= end; i++) {
            // Step 3: Check if the current number is prime
            if (isPrime(i)) {
                // Step 4: If the number is prime, add it to the array of prime numbers
                primes[index] = i;
                index++;
            }
        }

        //  Create a new array with the correct size to store only the prime numbers
        int[] result = new int[index];

        //  Copy the prime numbers from the original array to the new array
        for (int i = 0; i < index; i++) {
            result[i] = primes[i];
        }

        //  Return the array of prime numbers
        return result;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Check if the number is less than 2
        if (n < 2) {
            return false;
        }

        //  Loop through each number from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Step 3: Check if the number is divisible by any of these numbers
            if (n % i == 0) {
                // Step 4: If the number is divisible, it is not prime
                return false;
            }
        }

        // If the number is not divisible by any number from 2 to the square root of the number, it is prime
        return true;
    }
    }


