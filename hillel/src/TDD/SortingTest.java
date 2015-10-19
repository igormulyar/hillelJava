package TDD;

import less08oct15Inheritance.Cat;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by IMulyar on 19.10.2015.
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder(){
        Integer[] unsorted = {111, 999, 777, 333, 444, 666, 888, 222, 555};

        Sorter sorter = new Sorter();
        Integer[] sorted = (Integer[]) sorter.sort(unsorted);

        Integer[] expected = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        Assert.assertArrayEquals("Sorting is broken", expected, sorted);

        //Assert.fail(); - используется, когда нужно убедиться, что программа точно не доходит до этого места. Этот метод прекращает работу программы с ошибкой
    }

    @Test
    public void catsShoulBeSortedByName(){
        Cat cat = new Cat(false, 1,"Vaska","black");
        Cat cat2 = new Cat(false, 1,"Murka","black");
        Cat [] cats = {cat2, cat};
        cats [0] = cat;
        cats [1] = cat2;
        Sorter sorter = new Sorter();
        Cat[] sorted = (Cat[]) sorter.sort(cats);

        Cat[] expected = {cat2, cat};

        Assert.assertArrayEquals("cats are not sorted", expected, sorted);
    }

    @Test
    public void sourseArrayShouldBeUnsorted(){
        Integer[] unsorted = {111, 999, 777, 333, 444, 666, 888, 222, 555};
        Integer[] expected = {111, 999, 777, 333, 444, 666, 888, 222, 555};
        Sorter sorter = new Sorter();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Sourse array is sorted ", expected, unsorted);
    }
}
