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
        set.add("String5");
        set.add("String6");
        set.add("String7");
        set.add("String8");
        set.add("String9");
        set.add("String10");
        set.add("String11");


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