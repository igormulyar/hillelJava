package homework12.hashSetBycicle;

import homeWork10.Lists.ImprovedLinked;

import java.util.Iterator;

/**
 * Created by igor on 08.11.15.
 */
public class MyHashSet implements Iterable<Comparable> {

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
        int searchIndex = Math.abs(o.hashCode() % array.length);
        if (array[searchIndex].contains(o)) {
            array[searchIndex].remove(o);
            count--;
        }
    }

    public boolean contains(Comparable o) {
        int searchIndex = Math.abs(o.hashCode() % array.length);
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

    @Override
    public Iterator<Comparable> iterator() {
        return new Iter();
    }

    // ВНИМАНИЕ!
    // ГОВНОКОД!
    // Категорически не рекомендую разбираться, как работает этот итератор
    // Прошу лишь поверить на слово - работает. Я проверил.
    private class Iter implements Iterator {

        private int counter = 0;
        private int currentArrayIndex = 0;
        private int checkCurrentArrayIndex = -1;
        private ImprovedLinked currentListInArray = array[currentArrayIndex];
        private Comparable currentObject;
        private Iterator<Comparable> currentIterator;

        @Override
        public boolean hasNext() {
            if (counter >= size()) {
                return false;
            }

            while (currentArrayIndex <= array.length) {
                while (currentListInArray == null) {
                    currentArrayIndex++;
                    checkCurrentArrayIndex++;
                    currentListInArray = array[currentArrayIndex];
                }

                if (currentArrayIndex != checkCurrentArrayIndex) {
                    currentIterator = currentListInArray.iterator();
                    checkCurrentArrayIndex++;
                }

                if (currentIterator.hasNext()) {
                    currentObject = currentIterator.next();
                    counter++;
                    return true;
                } else {
                    currentArrayIndex++;
                    currentListInArray = array[currentArrayIndex];
                }
            }
            return false;
        }

        @Override
        public Object next() {
            return currentObject;
        }
    }
}
