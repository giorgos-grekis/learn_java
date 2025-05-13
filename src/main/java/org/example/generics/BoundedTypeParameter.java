package org.example.generics;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        int greaterThan = countGreaterThan(numbers, 0);
        System.out.println(greaterThan);


        Double[] numbers2 = {1.0,22.2,3.0};
        int greaterThan2 = countGreaterThan(numbers2, 2.0);
        System.out.println(greaterThan2);
    }

    interface A {}
    interface B {}

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) count++;
        }
        return count;
    }

}
