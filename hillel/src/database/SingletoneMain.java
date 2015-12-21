package database;

/**
 * Created by IMulyar on 21.12.2015.
 */
public class SingletoneMain {
    public static void main(String[] args) {
        SingletoneExample singleton = SingletoneExample.getInstance();
        singleton.someValue = "qwe";

        SingletoneExample singleton2 = SingletoneExample.getInstance();
        System.out.println(singleton2.someValue);
    }
}
