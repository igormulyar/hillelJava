package homeWork11.improvedArray;

import Exceptions.myExceptions.WrongIndexException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by TRUST on 21.10.2015.
 */
public class ImprovedListTest {

    //add() method
    @Test
    public void elementShouldBeAddedToRightPosition() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();            // initImprArr() метод в конце класса

        Object expected = "element 2";
        Object actual = improvedArray.get(2);
        Assert.assertEquals("element was added to the wrong position", expected, actual);
    }


    //get()
    @Test
    public void getShouldReturnCorrectObject() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();

        Object expected = "element 1";
        Object actual = improvedArray.get(1);
        Assert.assertEquals("get returned wrong number", expected, actual);
    }


    //size()
    @Test
    public void sizeShouldBeCorrect() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();

        int expected = 5;
        int actual = improvedArray.size();
        Assert.assertEquals("size is wrong", expected, actual);

        improvedArray.remove(4);
        expected = 4;
        actual = improvedArray.size();
        Assert.assertEquals("size is wrong", expected, actual);
    }


    //equals()
    @Test
    public void equalsShouldReturnTrueWhenObjectsAreTheSame() {
        ImprovedArray improvedArray = initImprArr();
        ImprovedArray improvedArray2 = initImprArr();

        boolean actual = improvedArray.equals(improvedArray2);
        Assert.assertEquals("equals() return \"false\" when objects are equal", true, actual);

        improvedArray2.add("99999");
        actual = improvedArray.equals(improvedArray2);
        Assert.assertNotEquals("equals() return \"true\" when objects are not equal", true, actual);
    }


    //toString()
    @Test
    public void toStringElementsShouldBeInOrder() {
        ImprovedArray improvedArray = initImprArr();
        String expected = "[element 0] [element 1] [element 2] [3] [element 4] ";
        String actual = improvedArray.toString();
        Assert.assertEquals("something wrong", expected, actual);
    }

    //toArray()
    @Test
    public void arraysShouldBeEqual() {
        ImprovedArray improvedArray = initImprArr();
        Object[] expected = {"element 0", "element 1", "element 2", "3", "element 4"};
        Object[] actual = improvedArray.toArray();
        Assert.assertArrayEquals("Arrays are not equal", expected, actual);
        Object[] expected2 = {"1", "2", "3"};
        Assert.assertFalse("arrays are equal, but should be not", Arrays.equals(expected2, actual));
    }


    //contains()
    @Test
    public void shouldContainElement() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        boolean actual = improvedArray.contains("element 1");
        Assert.assertTrue("cant find the element, but array contains it", actual);
        improvedArray.remove(1);
        actual = improvedArray.contains("element 1");
        Assert.assertFalse("returns \"true\", but element doesn't exist", actual);
    }


    //remove(Object)
    @Test
    public void objRemShouldNotContainRemovedObject() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.remove("element 2");
        boolean actual = improvedArray.contains("element 2");
        Assert.assertEquals("array contains the object that should be removed", false, actual);
    }

    @Test
    public void objRemCounterShouldBeDecreased() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.remove("element 2");
        int expected = 4;
        int actual = improvedArray.size();
        Assert.assertEquals("Counter have not been decreased", expected, actual);
    }


    //remove(index)
    @Test
    public void indexRemShouldNotContainRemovedObject() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.remove(0);
        boolean actual = improvedArray.contains("element 0");
        Assert.assertEquals("array contains the object that should be removed", false, actual);
    }

    @Test
    public void indexRemCounterShouldBeDecreased() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.remove(0);
        int expected = 4;
        int actual = improvedArray.size();
        Assert.assertEquals("Counter have not been decreased", expected, actual);
    }


    //extendArray()
    @Test
    public void sizeShouldBeElevenWhenEleventhElementAdded() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.add("5");
        improvedArray.add("6");
        improvedArray.add("7");
        improvedArray.add("8");
        improvedArray.add("9");
        improvedArray.add("eleventh element");
        int expected = 11;
        int actual = improvedArray.size();
        Assert.assertEquals("size is not 11 when eleventh element added", expected, actual);
    }


    //add(Object o, int index)
    @Test
    public void arrayShouldContainAddedByIndexElement() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.add(3, "added by index");
        boolean actual = improvedArray.contains("added by index");
        Assert.assertEquals("array doesn't contain added element", true, actual);
    }

    @Test
    public void elementsAfterAddedMustBeShifted() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.add(3, "added by index");
        Object expected = "element 4";
        Object actual = improvedArray.get(5);
        Assert.assertEquals("elements shifted not correctly or not shifted", expected, actual);
    }

    @Test
    public void sizeShouldBeIncreased() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.add(3, "added by index");
        int expected = 6;
        int actually = improvedArray.size();
        Assert.assertEquals("size hasn't been increased", expected, actually);
    }


    //updateWeather(Object o, index)
    @Test
    public void elementShouldBeChanged() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.set(3, "element 3");
        Object expected = "element 3";
        Object actual = improvedArray.get(3);
        Assert.assertEquals("The element has not been changed", expected, actual);
    }

    @Test
    public void sizeHaveNotBeenChanged() throws WrongIndexException {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.set(3, "element 3");
        int expected = 5;
        int actual = improvedArray.size();
        Assert.assertEquals("Size has been changed, but shouldn't!", expected, actual);
    }


    //clear()
    @Test
    public void returnedArrayShouldBeClear() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.clear();
        Object[] expected = {};
        Object[] actual = improvedArray.toArray();
        Assert.assertArrayEquals("elements are not referenced to NULL", expected, actual);
    }


    //clear() and isEmpty()
    @Test
    public void sizeShouldBeZero() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.clear();
        int expected = 0;
        int actual = improvedArray.size();
        Assert.assertEquals("size is not 0", expected, actual);
    }

    //sortIntAsc()
    @Test
    public void arrayShouldBeOrdered() {
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add("Киев");
        improvedArray.add("Одесса");
        improvedArray.add("Чернигов");
        improvedArray.add("Алчевск");
        improvedArray.add("Черновцы");
        improvedArray.sort();
        Object[] expected = {"Алчевск", "Киев", "Одесса", "Чернигов", "Черновцы"};
        Object[] actual = improvedArray.toArray();
        Assert.assertArrayEquals("array is not ordered", expected, actual);
    }


    //containsForSorted(String obj)
    @Test
    public void elementShouldBeFound() {
        ImprovedArray improvedArray = initImprArr();
        improvedArray.add("Киев");
        improvedArray.add("Одесса");
        improvedArray.add("Чернигов");
        improvedArray.add("Алчевск");
        improvedArray.add("Черновцы");
        boolean actual = improvedArray.containsForSorted("Одесса");
        Assert.assertTrue("Contained element hasn't been found", actual);
    }

    // improvedArray  initialization method
    private ImprovedArray initImprArr() {
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add("element 0");
        improvedArray.add("element 1");
        improvedArray.add("element 2");
        improvedArray.add("3");
        improvedArray.add("element 4");
        return improvedArray;
    }

    // since homeWork11

    //ImprovedList iterator
    @Test
    public void iteratorShouldReturnIterator() {
        ImprovedArray improvedArray = initImprArr();
        Assert.assertTrue(improvedArray.iterator() instanceof Iterator);
    }

    // iterator's hasNext() and next()
    @Test
    public void iteratorShouldWorkCorrectly() {
        ImprovedArray improvedArray = initImprArr();
        Iterator iterator = improvedArray.iterator();
        Assert.assertEquals("element 0", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("element 1", iterator.next());
        Assert.assertEquals("element 2", iterator.next());
        Assert.assertEquals("3", iterator.next());
        Assert.assertEquals("element 4", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void iteratorsRemoveShouldRemoved() {
        ImprovedArray improvedArray = initImprArr();
        Iterator iterator = improvedArray.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        Comparable[] expected = {"element 0", "element 1", "3", "element 4"};
        Comparable[] actual = improvedArray.toArray();
        Assert.assertArrayEquals(expected, actual);
    }
}