package org.example.generics;

import javax.print.DocFlavor;

public class GenericsAndMethods {

    public static void main(String[] args) {

        String[] names ={"Giorgos", "Cisu"};
        Character[] letters = {'A', 'B' , 'C'};

        Integer[] numbers = {1,2,3,4,5};

        print(names);
        print(letters);
        print(numbers);

    }

    static <T>void print(T[] array) {
        for (T e : array) {
            System.out.println(
                    e.getClass().getName() + " - " + e
            );
        }
    }
}
