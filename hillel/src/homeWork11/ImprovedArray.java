package homeWork11;

import homeWork10.Lists.ImprovedList;
import homeWork9.improvedArray.sorters.InsertSort;
import homeWork9.improvedArray.sorters.Sorter;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by igor on 20.10.15.
 */
public class ImprovedArray implements ImprovedList, Iterable<Comparable> {
    private Comparable[] array = new Comparable[10];
    private int elementsCounter = 0;

    @Override
    public void add(Comparable value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    // since homeWork 9
    @Override
    public void add(int index, Comparable o) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        System.arraycopy(array, index, array, index + 1, size() - index);
        array[index] = o;
        elementsCounter++;
    }

    // since homeWork 9
    @Override
    public void set(int index, Comparable o) {
        array[index] = o;
    }

    @Override
    public Comparable get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return elementsCounter;
    }

    @Override
    public boolean equals(ImprovedList other) {
        return Arrays.equals(this.toArray(), other.toArray());
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < elementsCounter; i++) {
            if (array[i] != null) {
                str = str + "[" + array[i] + "] ";
            }
        }
        return str;
    }

    @Override
    public Comparable[] toArray() {
        return Arrays.copyOf(array, elementsCounter);
    }

    // added in homeWork 6
    @Override
    public boolean contains(Comparable obj) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(obj)) return true;
        }
        return false;
    }

    // added in homeWork 6
    @Override
    public void remove(int index) {
        if (index < size()) {
            System.arraycopy(array, index + 1, array, index, size() - index + 1);
            elementsCounter--;
        }
    }

    // added in homeWork 6
    @Override
    public void remove(Comparable obj) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(obj) && i != size() - 1) {
                System.arraycopy(array, i + 1, array, i, size() - i + 1);
                elementsCounter--;
            }
        }
    }

    // since homeWork 9
    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            array[i] = null;
        }
        elementsCounter = 0;
    }

    // since homeWork 9
    @Override
    public boolean isEmpty() {
        return elementsCounter == 0;
    }

    // since homeWork 9
    public Comparable[] sort() {
        Sorter sorter = new InsertSort();
        array = sorter.sort(toArray());
        return toArray();
    }


    public boolean containsForSorted(Comparable obj) {
        //binary searching - не идеальный вариант, зато для меня понятен
        Comparable[] arr = sort();
        int lower = 0;
        int upper = arr.length - 1;
        int currIndex;
        Comparable searched;
        while (true) {
            currIndex = (lower + upper) / 2;
            if (arr[currIndex].compareTo(obj) == 0) {
                return true;
            } else if (lower > upper) {
                return false;
            } else {
                if (arr[currIndex].compareTo(obj) < 0) {
                    lower = currIndex + 1;
                } else {
                    upper = currIndex - 1;
                }
            }
        }
    }


    private void extendArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }



    //since homeWork11

    @Override
    public Iterator<Comparable> iterator() {
        return new Iter(this);
    }

    private class Iter implements Iterator{

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
        public Comparable next() {
            return list.get(cursorIndex++);
        }

        @Override
        public void remove() {
            list.remove(cursorIndex);
        }
    }
}
