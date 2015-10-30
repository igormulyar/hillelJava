package homeWork11.improvedArray;

/**
 * Created by TRUST on 30.10.2015.
 */
public class ForEachImprovedArray {
    public static void main(String[] args) {

        ImprovedArray list = new ImprovedArray();
        list.add("First");
        list.add("Second");
        list.add("third");
        list.add("Fourth");

        for (Comparable o : list) {
            System.out.println(o.toString());
        }
        System.out.println();

        list.sort();

        for (Comparable o : list) {
            System.out.println(o.toString());
        }
    }
}
