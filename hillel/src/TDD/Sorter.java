package TDD;

import java.util.Arrays;

/**
 * Created by IMulyar on 19.10.2015.
 */
public class Sorter {
    public Comparable[] sort(Comparable[] array) {
        Comparable[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                Comparable first = copy[i];
                Comparable second = copy[j];

                if (first.compareTo(second) > 0) {
                    Comparable temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }
}
