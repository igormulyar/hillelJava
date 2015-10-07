package homeWork5.improvedArray;

import java.util.Arrays;

/**
 * Created by igor on 07.10.15.
 */

// this task seems to be an introduction to Collections Framework. Looks like ArrayList

public class ImprovedArray {
    private int arrayLength=10;
    private String[] array = new String[arrayLength];
    private int elementsCounter;

    public void add(String value){
        this.array[elementsCounter]=value;
        elementsCounter++;
        if (elementsCounter==arrayLength-1){
            extandArray();
        }
    }

    public String get(int index){
        return array[index];
    }

    public int size(){
        return elementsCounter;
    }

    public boolean equals(ImprovedArray other){
        if (this.size() == other.size() && Arrays.equals(this.array,other.array)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String str="";
        for (int i=0; i<array.length; i++){
            if (array[i] != null){
                str=str+" ["+"] ";
            }
        }
        return str;
    }

    private void extandArray(){
        String[] temp=array;
        arrayLength*=2;
        array = new String[arrayLength];
    }


}
