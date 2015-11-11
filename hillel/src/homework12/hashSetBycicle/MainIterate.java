package homework12.hashSetBycicle;

/**
 * Created by igor on 11.11.15.
 */
public class MainIterate {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");


        for(Comparable o : set){
            System.out.println(o);
        }
    }
}

// OUT:
//        First
//        Second
//        Fourth
//        Third