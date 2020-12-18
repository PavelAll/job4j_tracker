package ru.job4j.collection;

import java.util.LinkedList;

public class UsageLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add(0, "Pavel");
        linkedList.add(1, "Pavel2");
        linkedList.add(1, "Nadya");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
