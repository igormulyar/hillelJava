package homeWork9.improvedArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by TRUST on 21.10.2015.
 */
public class Tester {

    //add() method
    @Test
    public void elementShouldBeAddedToRightPosition(){
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(3);
        improvedArray.add("Hello");
        improvedArray.add(3123.21);
        improvedArray.add("World");
        improvedArray.add(new Date());

        double expected = 3123.21;
        double actual = (double) improvedArray.get(2);
        Assert.assertEquals("double element was added to the wrong position", expected, actual, 0.001);

        String expS = "World";
        String actS = (String) improvedArray.get(3);
        Assert.assertEquals("string element was added to the wrong position", expS, actS);
    }

    //add() and size()
    @Test
    public void sizeShouldBeIncreasedWhenAdd(){
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(3);
        improvedArray.add("Hello");
        improvedArray.add(3123.21);
        improvedArray.add("World");
        improvedArray.add(new Date());

        int expected = 5;
        int actual = improvedArray.size();
        Assert.assertEquals("size is wrong when add",expected,actual);
    }

    //get()
    @Test
    public void getShouldReturnCorrectObject(){
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(3);
        improvedArray.add("Hello");
        improvedArray.add(3123.21);

        Object expected = "Hello";
        Object actual = improvedArray.get(1);
        Assert.assertEquals("get returned wrong number", expected, actual);
    }

    //size()
    @Test
    public void sizeShouldBeCorrect(){
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(3);
        improvedArray.add("Hello");
        improvedArray.add(3123.21);
        improvedArray.add("World");
        improvedArray.add(new Date());

        int expected = 5;
        int actual = improvedArray.size();
        Assert.assertEquals("size is wrong", expected, actual);

        improvedArray.remove(4);
        expected = 4;
        actual = improvedArray.size();
        Assert.assertEquals("size is wrong", expected, actual);
    }

    //equals
    @Test
    public void equalsShouldReturnTrueWhenObjectsAreTheSame(){
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(3);
        improvedArray.add("Hello");
        ImprovedArray improvedArray2 = new ImprovedArray();
        improvedArray2.add(3);
        improvedArray2.add("Hello");

        boolean expected = true;
        boolean actual = improvedArray.equals(improvedArray2);
        Assert.assertEquals("equals() return \"false\" when objects are equal",expected,actual);

        improvedArray2.add(999999999);
        expected = false;
        actual = improvedArray.equals(improvedArray2);
        Assert.assertEquals("equals() return \"false\" when objects are equal",expected,actual);
    }


}
