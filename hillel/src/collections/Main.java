package collections;

import less05oct.Cat;
import less05oct.Kitten;

import java.util.*;

/**
 * Created by IMulyar on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat(false, 10, "tom", "black"));
        someMethod(cats);

        System.out.println(cats.get(0));


        Set<Cat> catSet = new TreeSet<>();
        catSet.add(new Cat (false, 10, "tom", "black"));
        catSet.add(new Cat (true, 10, "Barsik", "Red"));
        catSet.add(new Cat (false, 10, "Brys", "black"));
        catSet.add(new Cat (false, 10, "Brys", "black"));
        someMethod(catSet);
    }

    private static void someMethod(Iterable<Cat> cats) {
        cats.forEach(System.out::print);
    }

    public static void genericAndCollection() {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(false, 10, "tom", "black"));
        cats.add(new Kitten(true, 10, "Barsik", "Red"));

        Cat cat = cats.get(0);
        //Kitten kitten = cats.get(1);  downcast forbidden
        Object o = cats.get(1);
    }

    public static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false, 10, "tom", "black"));
        list.add(10);
        list.add("word");

        for (Object o : list) {
            System.out.println(o);
        }

        list.forEach(System.out::println);

        Cat cat = (Cat) list.get(0);
        Integer i = (Integer) list.get(1);
    }
}
