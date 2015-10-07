package homeWork5.improvedArray;

/**
 * Created by igor on 07.10.15.
 */
public class Test {
    public static void main(String[] args) {

        // first object
        ImprovedArray ia1 = new ImprovedArray();
        ia1.add("Петя");
        ia1.add("Маша");
        ia1.add("Вася");
        ia1.add("qwer");
        ia1.add("ety");
        ia1.add("tyu");
        ia1.add("trt");
        ia1.add("qqq");
        ia1.add("wwww");
        System.out.println("size before array extending: " + ia1.size());
        ia1.add("eee");
        ia1.add("zzzzzzzz");
        System.out.println("size after array extending: " + ia1.size());
        System.out.println("\nprinting elements using toArray():");
        String[] arr = ia1.toArray();
        for (int i = 0; i < ia1.size(); i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Using toString() : \n" + ia1.toString());
        System.out.println("\nget() - fourth element is: " + ia1.get(3));

        //creating the second object and comparing with first
        ImprovedArray ia2 = new ImprovedArray();
        ia2.add("Username");
        ia2.add("user");
        System.out.println("ia1 equals ia2: " + ia1.equals(ia2));

        // the third object
        ImprovedArray ia3 = new ImprovedArray();
        ia3.add("Username");
        ia3.add("user");
        System.out.println("ia2 equals ia3: " + ia2.equals(ia3));

    }
}
