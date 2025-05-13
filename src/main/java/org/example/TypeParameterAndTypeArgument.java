package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeParameterAndTypeArgument {
    public static void main(String[] args) {
        List<String> names =
                new ArrayList<String>();

        names.add("String");

        List<Integer> numbers =
                new ArrayList<Integer>();

        Map<String, String> map =
                new HashMap<String, String>();

        Map<Point, Double> map2 =
                new HashMap<>();
    }
}
