package com.bridgelabz.Algorithm;

public class GenericsSorting<T> {

     static <T>void  printArray(T arr[]) {
        for(T array : arr ){
           System.out.println(array + " ");
        }
    }
    static <T extends Comparable<T>> void sorting(T arr[]){

//        Bubble sorting

        for (Integer i=0; i<arr.length-1; i++)
        {
            for (Integer j=0; j< arr.length-i-1; j++)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
//                    swap
                   T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
//    static <T extends Comparable <T>
    public static void main(String[] args) {

        Integer arr[] = {7, 8, 1, 3, 2};
        sorting(arr);
        printArray(arr);

        String arr1[] = {"Sachin","Rohit","Virat","Shikhar","Ravi"};
    sorting(arr1);
    printArray(arr1);


    }
}
