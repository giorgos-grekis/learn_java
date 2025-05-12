package org.example.queue;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
    }

    static class Person(String name, int age) {}
}
