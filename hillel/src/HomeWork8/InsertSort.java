package HomeWork8;

/**
 * Created by igor on 20.10.15.
 */
public class InsertSort {

    private int[] arr;

    public InsertSort() {
    }

    public InsertSort(int[] arr) {
        //this.arr = Arrays.copyOf(arr, arr.length);
        this.arr = arr;
    }

    public void putArrayToSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void insertSort (){
        sort(1);
    }

    public void sort(int h) {
        for (int out = h; out < arr.length; out++) {
            int temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - h] >= temp) {
                arr[in] = arr[in - 1];
                in -=h;
            }
            arr[in] = temp;
        }

    }

}
