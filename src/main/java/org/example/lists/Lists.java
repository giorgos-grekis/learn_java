package org.example.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> colorUnmodifiable = List.of(
                "blue",
                "yellow"
        );

//        colorUnmodifiable.add("red");  // This doesn't work because ImmutableCollections.List12(

        // shift + ctrl + space
        List<String> colors = new ArrayList<>();

        // add a value
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);

        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("green"));


        // loop throw the ArrayList
        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
