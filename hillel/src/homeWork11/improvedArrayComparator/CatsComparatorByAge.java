package homeWork11.improvedArrayComparator;

import less05oct.Cat;

import java.util.Comparator;

/**
 * Created by TRUST on 30.10.2015.
 */
public class CatsComparatorByAge implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
