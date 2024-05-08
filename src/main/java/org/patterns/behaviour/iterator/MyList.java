package org.patterns.behaviour.iterator;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {

    private T[] array;

    private int index;

    public MyList(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new iteratorImpl();
    }

    private class iteratorImpl implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return array.length > index;
        }

        @Override
        public T next() {
            return array[index++];
        }
    }
}
