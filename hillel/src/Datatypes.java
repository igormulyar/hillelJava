/**
 * Created by IMulyar on 21.09.2015.
 */
public class Datatypes {
    public static void main(String[] args) {

        byte b = 120;
        short s = b;
        long l = s;

        double  d = l; // возможна потеря точности, аналогично с float
        int i;

/*        l = 15;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("Int MV: "+intMaxValue);
        i = (int) l; // приведение типа "(тип)"
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("Long MV: "+ longMaxValue);
        long intOverflow = intMaxValue +1;
        i = (int) intOverflow;
        System.out.println("overflowed int: "+ i);*/

        d = Math.PI;

        i = (int) d;
        System.out.println("i = (int) d;  = "+ i);
        i = (int) 3.9;
        System.out.println("i = (int) 3.9; = "+i);
    }

    public static void realNumbersComparison() {
        if (1.1 + 2.2 == 3.3){
            System.out.println("they are equal");
        }else{
            System.out.println("they are not equal");
        }

        System.out.println("1.1 + 2.2 = "+ (1.1 + 2.2)); // output: 1.1 + 2.2 = 3.3000000000000003
    }

    public static void primitiveDataTypesEx() {
        int age =24;
        int days = age*365;
        int hours = days * 24;
        int seconds = hours * 3600;
        long milliseconds = seconds * 1000L;
        System.out.println(milliseconds);
        long longSeconds = milliseconds / 1000;

        seconds = (int) longSeconds;
        // seconds = (int) milliseconds/1000; - not correct

        System.out.println("\n");
        double d=3.45;
        int i = 10;
        long l = 5000000000L;
        float f = 2.5F;

        boolean bool = true;
        bool = false;
        // bool = 0 error!!!

        String str = "text";
        char a = 'b';
    }
}
