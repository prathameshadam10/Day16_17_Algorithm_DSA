package com.bridgelabz.orderedlist;

public class SortedLinkedListNum<T extends  Comparable<T>> {

    NodeNum<T> head;
    NodeNum<T> tail;

    public void addData(T data) {
        NodeNum<T> newNode = new NodeNum(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        NodeNum<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteAnyElement(T delete) {
        if (head == null) {
            return;
        }
        if (head.data.equals(delete)) {
            head = head.next;
            return;
        }
        NodeNum<T> prev = head;
        NodeNum<T> current = head.next;
        while (current != null) {
            if (current.data.equals(delete)) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void search(T search) {
        NodeNum<T> temp = head;
        boolean flag = false;
        while (temp != null) {
            if (temp.data.equals(search)) {
                flag = true;
                deleteAnyElement(search);
            }
            temp = temp.next;
        }
        if (!flag) {
            addData(search);
            System.out.println("Data Added successfully");
        }

    }

    public void sort() {
        NodeNum<T> temp1 = head;
        NodeNum<T> temp2 = head;
        T temp3;
        if (head != null) {
            while (temp1 != null) {
                temp2 = temp1.next;
                while (temp2 != null) {
                    if ((temp1.data.compareTo(temp2.data)) > 0) {
                        temp3 = temp1.data;
                        temp1.data = temp2.data;
                        temp2.data = temp3;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
}



