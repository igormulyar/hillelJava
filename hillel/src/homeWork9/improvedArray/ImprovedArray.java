package homeWork9.improvedArray;

import java.util.Arrays;

/**
 * Created by igor on 20.10.15.
 */
public class ImprovedArray {
    private Object [] array = new Object[10];
    private int elementsCounter = 0;

    public void add(Object value) {
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        this.array[elementsCounter] = value;
        elementsCounter++;
    }

    // since homeWork 9
    public void add(int index, Object o){
        if (elementsCounter > array.length - 1) {
            extendArray();
        }
        System.arraycopy (array, index, array, index+1, size()-index);
        array[index] = o;
        elementsCounter++;
    }

    // since homeWork 9
    public void set (int index, Object o){
        array[index] = o;
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

    // added in homeWork 6
    public boolean contains(Object obj){
        for (int i=0; i<size(); i++){
            if (array[i].equals(obj)) return true;
        }
        return  false;
    }
    // added in homeWork 6
    public void remove(int index){
        if (index<size()){
            System.arraycopy(array, index+1, array, index, size()-index+1);
            elementsCounter--;
        }
    }
    // added in homeWork 6
    public void remove(Object obj){
        for (int i=0; i<size(); i++){
            if (array[i].equals(obj) && i != size()-1){
                System.arraycopy(array, i+1, array, i, size()-i+1);
                elementsCounter--;
            }
        }
    }

    // since homeWork 9
    public void clear(){
        for (int i=0; i<size(); i++){
            array[i] = null;
        }
        elementsCounter = 0;
    }

    // since homeWork 9
    public boolean isEmpty (){
        return elementsCounter == 0;
    }

    private void extendArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }
}
