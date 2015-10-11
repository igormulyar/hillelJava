package homeWork6.improvedArrayForAll;

import java.util.Arrays;

/**
 * Created by igor on 11.10.15.
 */
public class ImprovedArray {
    private Object [] array = new String[10];
    private int elementsCounter = 0;

    public void add(String value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    public Object get(int index) {
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

    public Object[] toArray() {
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

    // added in homeWork 6
    public boolean contains(Object obj){
        for (int i=0; i<size(); i++){
            if (array[i].equals(obj)) return true;
        }
        return  false;
    }

    public void remove(int index){
        if (index<size()){
            System.arraycopy(array, index+1, array, index, size()-index+1);
            elementsCounter--;
        }
    }

    public void remove(Object obj){
        for (int i=0; i<size(); i++){
            if (array[i].equals(obj) && i != size()-1){
                System.arraycopy(array, i+1, array, i, size()-i+1);
                elementsCounter--;
            }
        }
    }

}
