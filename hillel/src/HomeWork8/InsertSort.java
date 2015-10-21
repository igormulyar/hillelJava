package HomeWork8;

import java.util.Arrays;

/**
 * Created by igor on 20.10.15.
 */
public class InsertSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        for (int out = 1; out < arr.length; out++) {
            int temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
        return arr;
    }
}
