package homework12.hashSetBycicle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by igor on 08.11.15.
 */
public class MyHashSetTest {

    //add
    @Test
    public void setShouldContainTheObjectAfterAdd() {
        MyHashSet set = initMyHashSet();
        Assert.assertTrue(set.contains("String1"));
        Assert.assertTrue(set.contains("String2"));
        Assert.assertTrue(set.contains("String3"));
    }

    @Test
    public void setShouldHaveRightSizeAfterAdd() {
        MyHashSet set = initMyHashSet();
        Assert.assertEquals(3, set.size());
    }

    @Test
    public void setShouldHaveRightSizeAfterRemove() {
        MyHashSet set = initMyHashSet();
        set.remove("String1");
        Assert.assertEquals(2, set.size());
    }

    @Test
    public void setShouldNotContainRemovedElement() {
        MyHashSet set = initMyHashSet();
        set.remove("String1");
        Assert.assertFalse(set.contains("String1"));
    }

    @Test
    public void setShouldBeExtendable(){
        MyHashSet set = initMyHashSet();
        set.add("String4");
        set.add("String5");
        set.add("String6");
        set.add("String7");
        set.add("String8");
        set.add("String9");
        set.add("String10");
        set.add("String11");
    }

    @Test
    public void containsTest() {
        MyHashSet set = initMyHashSet();
        set.add("someString");
        Assert.assertTrue(set.contains("someString"));
        set.remove("someString");
        Assert.assertFalse(set.contains("someString"));
        set.remove("String1");
        Assert.assertFalse(set.contains("String1"));
    }



    private MyHashSet initMyHashSet() {
        MyHashSet set = new MyHashSet();
        set.add("String1");
        set.add("String2");
        set.add("String3");
        return set;
    }


}
