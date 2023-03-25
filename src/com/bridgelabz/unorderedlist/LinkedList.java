package com.bridgelabz.unorderedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void addData(T data){
        Node<T> newNode = new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data + "-> ");
            temp= temp.next;
        }
    }
    public void deleteAnyelement(T delete) {
        if (head == null) {
            return;
        }

        if (head.data.equals(delete)) {
            head = head.next;
            return;
        }

        Node<T> prev = head;
        Node<T> current = head.next;

        while (current != null) {
            if (current.data.equals(delete)) {
                System.out.println("DATA DELETED SUCCESSFULLY");
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void search(T search) {
        Node <T> temp = head;
        boolean flag= false;
        while(temp!=null)
        {
            if(temp.data.equals(search))
            {
                flag=true;
                deleteAnyelement(search);
            }
            temp=temp.next;
        }
        if(!flag){
            addData(search);
            System.out.println("data added successfully");
        }
    }


}
