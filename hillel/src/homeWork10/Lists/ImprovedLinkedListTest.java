package homeWork10.Lists;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by igor on 27.10.15.
 */
public class ImprovedLinkedListTest {

    //add(o)
    @Test
    public void sizeChangedOnAdd() {
        ImprovedLinked list = new ImprovedLinked();

        Assert.assertEquals(0, list.size());
        list.add("First");
        Assert.assertEquals(1, list.size());
        list.add("Second");
        Assert.assertEquals(2, list.size());
        list.add("Third");
        Assert.assertEquals(3, list.size());
    }

    // add (index, o)
    @Test
    public void valueAndSizeChangedWhenAddByIndex() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(0, "Zero");
        list.add(2, "Second with half");
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Second with half", list.get(2));
        Assert.assertEquals("Zero", list.get(0));
    }

    //set
    @Test
    public void valueChangedButSizeNotWhenSet() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.set(2, "Changed");
        list.set(0, "Zero index");
        Assert.assertEquals("Zero index", list.get(0));
        Assert.assertEquals("Changed", list.get(2));
        Assert.assertEquals(3, list.size());
    }

    // equals
    @Test
    public void everyElemShouldBeEqual() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        ImprovedLinked list2 = new ImprovedLinked();
        list2.add("ZeroElement");
        list2.add("Second");
        list2.add("Third");
        Assert.assertFalse(list.equals(list2));
        list2.set(0, "First");
        Assert.assertTrue(list.equals(list2));
    }

    //toArray
    @Test
    public void arrayShoudAgreeWithList() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        Comparable[] expected = {"First", "Second", "Third"};
        Assert.assertArrayEquals(expected, list.toArray());
    }

    //contains
    @Test
    public void shouldFindTheObject() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Assert.assertFalse(list.contains("qwerty"));
        Assert.assertTrue(list.contains("Third"));
    }

    //remove (index)
    @Test
    public void sizeShouldBeDecreasedAndObjectDeleted() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.remove(0);
        list.remove(1);
        Assert.assertEquals(2, list.size());
        Comparable[] expected = {"Second", "Fourth"};
        Assert.assertArrayEquals(expected, list.toArray());
    }

    //remove(obj)
    @Test
    public void sizeShouldBeDecreasedAndObjectDeletedByObj() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.remove("First");
        list.remove("Third");
        Assert.assertEquals(2, list.size());
        Comparable[] expected = {"Second", "Fourth"};
        Assert.assertArrayEquals(expected, list.toArray());
    }

    //clear
    @Test
    public void sizeShouldBeZero() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    //isEmpty
    @Test
    public void sizeShouldBeZeroIfEmptyAndFalseIfContains() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Assert.assertFalse(list.isEmpty());
        list.clear();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
    }

    //toString
    @Test
    public void toStringShouldReturnALineOfTextElements() {
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Assert.assertEquals("First Second Third Fourth ", list.toString());
    }
}
