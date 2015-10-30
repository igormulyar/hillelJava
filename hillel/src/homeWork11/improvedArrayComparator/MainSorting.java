package homeWork11.improvedArrayComparator;

import homeWork10.Lists.*;
import less05oct.Cat;

/**
 * Created by TRUST on 30.10.2015.
 */
public class MainSorting {
    public static void main(String[] args) {
        Cat murka = new Cat (true, 2, "Murka", "Grey");
        Cat kuzya = new Cat (true, 3, "Kuzya", "Red");
        Cat jora = new Cat (false, 5, "Jora", "BlackAndWhite");
        Cat vasiliy = new Cat (false, 1, "Vasiliy", "Grey");

        ImprovedArray list = new ImprovedArray();
        list.add(murka);
        list.add(kuzya);
        list.add(jora);
        list.add(vasiliy);

        System.out.println("Before sorting:");
        printList(list);
        System.out.println();

        list.sort(new CatsComparatorByAge());
        System.out.println("After sorting by age: ");
        printList(list);
        System.out.println();

        list.sort(new CatsComparatorByName());
        System.out.println("After sorting by Name:");
        printList(list);
    }

    private static void printList(ImprovedArray list) {
        for (Object o : list){
            System.out.println(o.toString());
        }
    }
}

      /*
      OUT:
        Before sorting:
        Cat{pet=true, age=2, name='Murka', color='Grey'}
        Cat{pet=true, age=3, name='Kuzya', color='Red'}
        Cat{pet=false, age=5, name='Jora', color='BlackAndWhite'}
        Cat{pet=false, age=1, name='Vasiliy', color='Grey'}

        After sorting by age:
        Cat{pet=false, age=1, name='Vasiliy', color='Grey'}
        Cat{pet=true, age=2, name='Murka', color='Grey'}
        Cat{pet=true, age=3, name='Kuzya', color='Red'}
        Cat{pet=false, age=5, name='Jora', color='BlackAndWhite'}

        After sorting by Name:
        Cat{pet=false, age=5, name='Jora', color='BlackAndWhite'}
        Cat{pet=true, age=3, name='Kuzya', color='Red'}
        Cat{pet=true, age=2, name='Murka', color='Grey'}
        Cat{pet=false, age=1, name='Vasiliy', color='Grey'}*/