package iterator;

import collections.RecursiveLinkedList;
import homeWork10.Lists.ImprovedLinked;
import less05oct.Cat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IMulyar on 29.10.2015.
 */
public class MainIterator {
    public static void main(String[] args) {

        Cat tom = new Cat(false, 4, "Tom", "Black");
        Cat murzik = new Cat(true, 3, "Murzik", "White");
        Cat barsik = new Cat (false, 6, "Barsik", "Blue");


        RecursiveLinkedList cats = new RecursiveLinkedList();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        Iterator iterator = cats.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("foreach loop: ");

        List someList = new ArrayList<>();
        for(Object o : cats ){
            System.out.println(o);
        }



    }
}
