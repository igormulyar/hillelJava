package HomeWork8;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by igor on 17.10.15.
 */
public class Tester {

    @Test
    public void arrayHaveToBeSortedWithInsert() {
        int[] array = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        InsertSort insertSort = new InsertSort();
        insertSort.putArrayToSort(array);
        insertSort.insertSort();

        Assert.assertArrayEquals("Something WRONG! ", expected, array);
    }

    @Test
    public void arrayHaveToBeSortedWithShell() {
        int[] array = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ShellSort shellSort = new ShellSort();
        shellSort.putArrayToSort(array);
        shellSort.shellSort();

        Assert.assertArrayEquals("Something WRONG! ", expected, array);
    }
}
