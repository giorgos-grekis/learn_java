package org.example.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList();

        linkedList.add(new Person("John", 28));
        linkedList.add(new Person("Jane", 29));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
