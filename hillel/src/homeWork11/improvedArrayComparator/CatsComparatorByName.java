package homeWork11.improvedArrayComparator;

import less05oct.Cat;

import java.util.Comparator;

/**
 * Created by TRUST on 30.10.2015.
 */
public class CatsComparatorByName implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
