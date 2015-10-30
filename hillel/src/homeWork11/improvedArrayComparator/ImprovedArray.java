package homeWork11.improvedArrayComparator;

import homeWork10.Lists.ImprovedList;
import homeWork9.improvedArray.sorters.InsertSort;
import homeWork9.improvedArray.sorters.Sorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by igor on 20.10.15.
 */
public class ImprovedArray implements Iterable<Object> {
    private Object[] array = new Object[10];
    private int elementsCounter = 0;


    public void add(Object value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    // since homeWork 9

    public void add(int index, Object o) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        System.arraycopy(array, index, array, index + 1, size() - index);
        array[index] = o;
        elementsCounter++;
    }

    // since homeWork 9

    public void set(int index, Object o) {
        array[index] = o;
    }


    public Object get(int index) {
        return array[index];
    }


    public int size() {
        return elementsCounter;
    }


    public boolean equals(ImprovedList other) {
        return Arrays.equals(this.toArray(), other.toArray());
    }


    public String toString() {
        String str = "";
        for (int i = 0; i < elementsCounter; i++) {
            if (array[i] != null) {
                str = str + "[" + array[i] + "] ";
            }
        }
        return str;
    }


    public Object[] toArray() {
        return Arrays.copyOf(array, elementsCounter);
    }

    // added in homeWork 6

    public boolean contains(Object obj) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(obj)) return true;
        }
        return false;
    }

    // added in homeWork 6

    public void remove(int index) {
        if (index < size()) {
            System.arraycopy(array, index + 1, array, index, size() - index + 1);
            elementsCounter--;
        }
    }

    // added in homeWork 6

    public void remove(Object obj) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(obj) && i != size() - 1) {
                System.arraycopy(array, i + 1, array, i, size() - i + 1);
                elementsCounter--;
            }
        }
    }

    // since homeWork 9

    public void clear() {
        for (int i = 0; i < size(); i++) {
            array[i] = null;
        }
        elementsCounter = 0;
    }

    // since homeWork 9

    public boolean isEmpty() {
        return elementsCounter == 0;
    }

    // since homeWork 11
    public void sort(Comparator comparator) {
        for (int out = 1; out < size(); out++) {
            Object temp = array[out];
            int in = out;
            while (in > 0 && comparator.compare(array[in - 1], temp) >= 0) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = temp;
        }
    }


    private void extendArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    //since homeWork11

    @Override
    public Iterator<Object> iterator() {
        return new Iter(this);
    }

    private class Iter implements Iterator {

        private final ImprovedArray list;
        int cursorIndex;
        int indexOfLastReturned = -1;

        public Iter(ImprovedArray list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return cursorIndex < list.size();
        }

        @Override
        public Object next() {
            return list.get(cursorIndex++);
        }

        @Override
        public void remove() {
            list.remove(cursorIndex);
        }
    }
}
