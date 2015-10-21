package HomeWork8;

/**
 * Created by igor on 20.10.15.
 */
public class InsertSort {

    private int[] arr;

    public InsertSort() {
    }

    public InsertSort(int[] arr) {                      // сделал "на всякий случай" чисто для учебных целей
        //this.arr = Arrays.copyOf(arr, arr.length);    // знаю, что он здесь не нужен
        this.arr = arr;
    }

    public void putArrayToSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void insertSort (){
        sort(1);                                        // потому что h в инсерте должен быть равен 1
    }

    public void sort(int h) {                           // принимает h, чтобы инсерт можно было
        for (int out = h; out < arr.length; out++) {    // использовать в шелле
            int temp = arr[out];
            int in = out;
            while (in > h-1 && arr[in - h] >= temp) {
                arr[in] = arr[in - h];
                in -=h;
            }
            arr[in] = temp;
        }

    }

}
