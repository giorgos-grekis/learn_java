package org.example.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        // print the arrays
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        // loop throw arrays
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(color -> System.out.println(color));
        Arrays.stream(colors).forEach(System.out::println);



//        for (int i =  colors.length - 1; i >=0; i--) {
//            System.out.println(colors[i]);
//        }


        int[] numbers = {100, 200};

        System.out.println(Arrays.toString(numbers));




    }
}
