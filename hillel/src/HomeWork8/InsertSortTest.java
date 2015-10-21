package HomeWork8;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by TRUST on 21.10.2015.
 */
public class InsertSortTest {

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
    public void sourceArrayShouldBeUnsorted() {
        int[] unsorted = {8, 2, 7, 3, 6, 4, 5, 1, 9};
        int[] expected = {8, 2, 7, 3, 6, 4, 5, 1, 9};

        Sorter sorter = new InsertSort();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Error. Source array are sorted. It have to be not sorted", expected, unsorted);
    }
}
