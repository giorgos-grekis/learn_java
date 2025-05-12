package org.example.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Giorgos", 36));
        supermarket.add(new Person("Cisu", 21));
        supermarket.add(new Person("Test", 69));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {}
}
