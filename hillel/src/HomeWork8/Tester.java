package HomeWork8;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by igor on 17.10.15.
 */
public class Tester {

    @Test
    public void arrayHaveToBeSortedWithInsert() {
        int[] unsorted = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] sorted;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sorter insertSort = new InsertSort();
        sorted = insertSort.sort(unsorted);

        Assert.assertArrayEquals("Something WRONG! Your array are not sorted!", expected, sorted);
    }

    @Test
    public void arrayHaveToBeSortedWithShell() {
        int[] unsorted = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] sorted;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sorter shellSort = new ShellSort();
        sorted = shellSort.sort(unsorted);

        Assert.assertArrayEquals("Something WRONG! Your array are not sorted!", expected, sorted);
    }

    @Test
    public void sourceArrayShouldBeUnsorted(){
        int[] unsorted = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] expected = {8, 2, 7, 3, 6, 4, 5, 1, 9};

        Sorter sorter = new ShellSort();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Error. Source array are sorted. It have to be not sorted",expected, unsorted);
    }
}
