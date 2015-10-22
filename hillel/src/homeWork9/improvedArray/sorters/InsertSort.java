package homeWork9.improvedArray.sorters;

import java.util.Arrays;

/**
 * Created by igor on 20.10.15.
 */
public class InsertSort implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] array) {
        Comparable[] arr = Arrays.copyOf(array, array.length);
        for (int out = 1; out < arr.length; out++) {
            Comparable temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1].compareTo(temp) >= 0) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
        return arr;
    }
}
