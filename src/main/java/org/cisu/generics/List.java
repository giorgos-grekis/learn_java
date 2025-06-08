package org.cisu.generics;

public class List<I extends Number> {
    private Object[] items = new Object[10];
    private int count;

    public static java.util.List<String> of(String a, String b, String c) {
        return null;
    }

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}
