package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards

        // Unbounded Wildcards
        List<Object> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(1,2);
        print(list1);
        print(list2);


    }

//    static <T>void print(List<T> list) {
//        list.forEach(System.out::println);
//    }


    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
                });

    }

}
