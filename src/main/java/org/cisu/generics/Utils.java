package org.cisu.generics;


public class Utils  {
    public static <T extends Comparable<T>> T max(T first, T second) {
//        return first > second ? first : second;
        return first.compareTo(second) < 0 ? second : first;
    }


}
