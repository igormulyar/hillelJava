package garbage;

/**
 * Created by igor on 17.10.15.
 */
public class Sorter {


    public static int[] insertSort(int[] arr) {
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

    public static int[] shellSort(int[] arr) {
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

    // хотел также реализовать quick sort, но.. ниасилил(( ..пока что

}
