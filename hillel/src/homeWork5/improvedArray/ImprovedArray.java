package homeWork5.improvedArray;

import java.util.Arrays;

/**
 * Created by igor on 07.10.15.
 */

// this task seems to be an introduction to Collections Framework. Looks like beta version of ArrayList

public class ImprovedArray {
    private String[] array = new String[10];
    private int elementsCounter = 0;

    public void add(String value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    public String get(int index) {
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

    public String[] toArray() {
        return Arrays.copyOf(array, elementsCounter);
    }

    private void extendArray() {
        /*String[] temp = array;
        array = new String[array.length*2];
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }*/
        array = Arrays.copyOf(array, array.length * 2);
    }


}
