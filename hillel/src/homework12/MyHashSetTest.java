package homework12;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by igor on 08.11.15.
 */
public class MyHashSetTest {

    //add
    @Test
    public void setShouldContainTheObjectAfterAdd(){
        MyHashSet set = new MyHashSet();
        set.add("String1");
        set.add("String2");
        set.add("String3");
        Assert.assertTrue(set.contains("String1"));
        Assert.assertTrue(set.contains("String2"));
        Assert.assertTrue(set.contains("String3"));
    }


}
