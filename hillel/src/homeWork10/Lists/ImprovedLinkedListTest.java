package homeWork10.Lists;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by igor on 27.10.15.
 */
public class ImprovedLinkedListTest {

    @Test
    public void sizeChangedOnAdd(){
        ImprovedLinked list = new ImprovedLinked();

        Assert.assertEquals(0, list.size());
        list.add("First");
        Assert.assertEquals(1, list.size());
        list.add("Second");
        Assert.assertEquals(2, list.size());
        list.add("Third");
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void valueAndSizeChangedWhenAddByIndex(){
        ImprovedLinked list = new ImprovedLinked();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(2, "Second with half");
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Second with half", list.get(2));
    }


}
