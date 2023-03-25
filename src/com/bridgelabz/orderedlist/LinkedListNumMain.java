package com.bridgelabz.orderedlist;

import java.util.Scanner;

public class LinkedListNumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   SortedLinkedListNum<Integer> sortedLinkedListNum = new SortedLinkedListNum<>();
        System.out.println("How many number do you want to add: ");
        int number = sc.nextInt();
        for(int i=0; i<number; i++){
            System.out.println("Enter the number which you want add to the linkedList:");
            int num = sc.nextInt();
            sortedLinkedListNum.addData(num);
        }
        System.out.println("Original Linked List");
        sortedLinkedListNum.display();
        System.out.println();
        System.out.println("sorted linked list");
        sortedLinkedListNum.sort();
        sortedLinkedListNum.display();
        while (true){
            System.out.println();
            System.out.println("Enter a number to check weather it is present or not:-");
            int n = sc.nextInt();
            sortedLinkedListNum.search(n);
            System.out.println("Updated linked list");
            sortedLinkedListNum.display();
        }
    }
}
