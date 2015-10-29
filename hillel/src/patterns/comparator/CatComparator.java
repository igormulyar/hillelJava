package patterns.comparator;

import jdk.nashorn.internal.runtime.RewriteException;
import less05oct.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IMulyar on 29.10.2015.
 */
public class CatComparator {
    public static void main(String[] args) {
        Cat tom = new Cat(false, 4, "Tom", "Black");
        Cat murzik = new Cat(true, 3, "Murzik", "White");
        Cat barsik = new Cat (false, 6, "Barsik", "Blue");


        List<Cat> cats = new ArrayList<>();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        System.out.println("before sort: ");
        print(cats);

        Collections.sort(cats);

        System.out.println("cats after sorting:");
        print(cats);

        Collections.sort(cats, new SortByAge());

        System.out.println("sorted by age with Comparator");
        print(cats);

        Collections.sort(cats, new Reversed(new SortByAge()));
        System.out.println("reverse sort:");
        print(cats);

    }

    public static void print (List<Cat> cats){
        cats.forEach(System.out::println);
    }
}
