package homework12;

import homeWork10.Lists.ImprovedLinked;

import java.util.LinkedList;

/**
 * Created by igor on 08.11.15.
 */
public class MyHashSet {

    private ImprovedLinked[] array = new ImprovedLinked[10];
    private int count = 0;

    public void add(Comparable o) {
        int index = calcHashIndex(o);
        if (count > 0.7 * array.length) {
            extendArray();
        }
        if (array[index] == null) {
            array[index] = new ImprovedLinked();
        }
        if (!array[index].contains(o)) {
            array[index].add(o);
        }
        count++;

    }

    public void remove(Comparable o) {
        int searchIndex = o.hashCode() % array.length;
        for (Comparable obj : array[searchIndex]) {
            if (obj.equals(o)) {
                array[searchIndex].remove(o);
                count--;
            }
        }

    }

    public boolean contains(Comparable o) {
        int searchIndex = Math.abs(o.hashCode() % array.length);
        System.out.println("searchIndex = " + searchIndex);
        if (array[searchIndex] == null) {
            return false;
        }
        return array[searchIndex].contains(o);
    }

    public int size() {
        return count;
    }

    private void extendArray() {
        ImprovedLinked[] newArray = new ImprovedLinked[array.length * 3];
        for (ImprovedLinked list : array) {
            for (Comparable obj : list) {
                newArray[calcHashIndex(obj)].add(obj);
            }
        }
        array = newArray;
    }

    private int calcHashIndex(Comparable o) {
        int index = Math.abs(o.hashCode() % array.length);
        return index;
    }

}
