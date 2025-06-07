package org.cisu.generics;

// T => Type
// E => Element

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return (T) items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }
}
