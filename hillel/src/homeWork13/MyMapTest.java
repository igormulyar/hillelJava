package homeWork13;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by TRUST on 11.11.2015.
 */
public class MyMapTest {

    @Test
    public void sizeShouldBeIncreasedWhenAdd(){
        MyMap map = mapInit();
        Assert.assertEquals(5,map.size());

    }

    @Test
    public void consistShouldReturnTrueIfConsist(){
        MyMap map = mapInit();
        Assert.assertTrue(map.containsKey("k3"));
    }

    @Test
    public void getShouldReturnCorrectValue(){
        MyMap map = mapInit();
        Assert.assertEquals("v3", map.get("k3"));
    }

    @Test
    public void setShouldBeEqualToKeySet(){
        MyMap map = mapInit();
        Set<Object> set = new HashSet<>();
        set.add("k1");
        set.add("k2");
        set.add("k3");
        set.add("k4");
        set.add("k5");
        Assert.assertEquals(set,map.keySet());
    }


    private MyMap mapInit (){
        MyMap map = new MyMap();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.put("k5", "v5");
        return map;
    }
}
