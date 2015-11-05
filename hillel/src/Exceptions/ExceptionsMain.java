package Exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class ExceptionsMain {
    public static void main(String[] args) throws Exception {
        Integer i = null;

        System.out.println("before");
        try {
            System.out.println("in try block before");
            nestedMethod1(i);
            System.out.println("in try block after"); // won't execute
        } catch (NullPointerException e) { // "NPE" - means NullPointerException
            System.out.println("something wrong: " + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("something else wrong: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("RunTimeException caught :" + e.toString());
        }
        System.out.println("after");

    }

    private static void nestedMethod1(Integer i) throws Exception {
       /* List<Integer> integers = new ArrayList<>();
        integers.get(1);*/

        if(true)
            throw new Exception("My Exception");

        if (true)
        throw new RuntimeException("my own exception");
        nestedMethod2(i);
    }

    private static void nestedMethod2(Integer i) {
        i.toString();
    }
}
