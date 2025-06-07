package org.cisu.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c");
        collection.remove("a");
        var objectArray = collection.toArray();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);
        System.out.println(collection);
    }
}
