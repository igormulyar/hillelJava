package less05oct;

import java.util.Arrays;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class OOP {

    static String sharedString;


    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println(i);
        System.out.println(sharedString);

        int [] ints = {1, 2, 3};
        add(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(sharedString);

        sharedString = "Some string";
    }

    private static void add(int[] ints) {
        ints[0] = ints[0]+1;
        ints[1] = ints[1]+1;
        ints[2] = ints[2]+1;
        sharedString = "shared string after add int[] method";
    }

    private static void add(int i) {
        i++;
        sharedString = "shared string after add int method";
    }

    public static void printString(){
        System.out.println(sharedString);
    }


}
