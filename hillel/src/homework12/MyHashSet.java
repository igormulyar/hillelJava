package homework12;

import java.util.LinkedList;

/**
 * Created by igor on 08.11.15.
 */
public class MyHashSet {

    private LinkedList[] array = new LinkedList[10];
    private int count = 0;

    public void add (Object o){
        if (!contains(o)){
        if(count > 0.7*array.length){
            extendArray();
        }
        array[calcHashIndex(o)].add(o);
        count++;
        }
    }

    public void remove (Object o){
        int searchIndex = o.hashCode()%array.length;
        for (Object obj : array[searchIndex]){
            if(obj.equals(o)){
                array[searchIndex].remove(o);
                count--;
            }
        }

    }

    public boolean contains (Object o){
        int searchIndex = o.hashCode()%array.length;
        for (Object obj : array[searchIndex]){
            if(obj.equals(o)){
            return true;
            }
        }
        return false;
    }

    public int size(){
        return count;
    }

    private void extendArray(){
        LinkedList[] newArray = new LinkedList[array.length*3];
        for (LinkedList list : array){
            for(Object obj : list){
                newArray[calcHashIndex(obj)].add(obj);
            }
        }
        array = newArray;
    }

    private int calcHashIndex(Object o){
        System.out.println("Objects HashCode: "+o.hashCode());
        int index = Math.abs(o.hashCode() % array.length);
        System.out.println("calculated index is: " + index);
        return index;
    }

}
