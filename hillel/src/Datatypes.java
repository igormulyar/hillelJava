/**
 * Created by IMulyar on 21.09.2015.
 */
public class Datatypes {
    public static void main(String[] args) {
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
