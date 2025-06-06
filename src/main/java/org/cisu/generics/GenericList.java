package org.cisu.generics;

// T => Type
// E => Element

public class GenericList<T extends Comparable & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return (T) items[index];
    }
}
