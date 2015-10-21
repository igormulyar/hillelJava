package HomeWork8;

import java.util.Arrays;

/**
 * Created by igor on 17.10.15.
 */
public class Test {
    public static void main(String[] args) {
        int [] array = {8,2,7,3,6,4,5,1,9};
        int [] expected = {1,2,3,4,5,6,7,8,9};

//        InsertSort insertSort = new InsertSort();
//        insertSort.putArrayToSort(array);
//        insertSort.insertSort();

//        ShellSort shellSort = new ShellSort();
//        shellSort.putArrayToSort(array);
//        shellSort.shellSort();

        if (Arrays.equals(array,expected)){
            System.out.println("OK! " + Arrays.toString(array));
        } else {
            System.out.println("FAILED! Array is " + Arrays.toString(array));
        }

    }
}
