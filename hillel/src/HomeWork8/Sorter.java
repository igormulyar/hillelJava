package HomeWork8;

/**
 * Created by igor on 17.10.15.
 */
public class Sorter {

    public static int[] insertSort(int[] arr) {
        int in;
        int out;
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
        return arr;
    }

    public static int[] shellSort(int[] arr){
        int inner;
        int outer;
        int temp;
        int h = 1;
        while (h <= arr.length){
            h = h*3 + 1;
        }
        while (h>0){
            for (outer = h; outer < arr.length; outer++){
                temp = arr[outer];
                inner = outer;
                while(inner>h-1 && arr[inner-h] >= temp){
                    arr[inner] = arr[inner-h];
                    inner -=h;
                }
                arr[inner] = temp;
            }
            h = (h-1)/3;
        }
        return arr;
    }

}
