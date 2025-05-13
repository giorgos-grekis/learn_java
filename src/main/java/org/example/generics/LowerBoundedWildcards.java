package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards

        // Unbounded Wildcards
//        List<Double> list1 = Arrays.asList(1.9,1.3); // it doesn't work
        List<Integer> list2 = Arrays.asList(1,2);
        List<Number> list3 = Arrays.asList();
//        print(list1);
        print(list2);
        print(list3);


    }


    // Number is the super class of Integer
    static void print(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

}
