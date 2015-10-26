package homeWork10.Lists;

import homeWork9.improvedArray.sorters.InsertSort;
import homeWork9.improvedArray.sorters.Sorter;

import java.util.Arrays;

/**
 * Created by igor on 20.10.15.
 */
public class ImprovedArray implements ImprovedList {
    private Comparable[] array = new Comparable[10];
    private int elementsCounter = 0;

    public void add(Comparable value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    // since homeWork 9
    public void add(int index, Comparable o) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        System.arraycopy(array, index, array, index + 1, size() - index);
        array[index] = o;
        elementsCounter++;
    }

    // since homeWork 9
    public void set(int index, Comparable o) {
        array[index] = o;
    }

    public Comparable get(int index) {
        return array[index];
    }

    public int size() {
        return elementsCounter;
    }

    public boolean equals(ImprovedArray other) {
        return Arrays.equals(this.array, other.array);
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

    public Comparable[] toArray() {
        return Arrays.copyOf(array, elementsCounter);
    }

    // added in homeWork 6
    public boolean contains(Comparable obj) {
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
    public void remove(Comparable obj) {
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

}
