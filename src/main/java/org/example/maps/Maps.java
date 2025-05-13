package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        map.put(3, new Person("Mariam 2"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));

        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        // remove
        map.remove(3);

        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    record Person(String name) {

    }
}
