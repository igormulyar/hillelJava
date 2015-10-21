package HomeWork8;

import java.util.Arrays;

/**
 * Created by igor on 20.10.15.
 */
public class ShellSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int h = 1;
        while (h <= arr.length/3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int out = h; out < arr.length; out++) {
                int temp = arr[out];
                int in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h - 1) / 3;
        }
        return arr;
    }
}
