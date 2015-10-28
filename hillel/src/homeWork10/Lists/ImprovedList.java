package homeWork10.Lists;

/**
 * Created by igor on 24.10.15.
 */
public interface ImprovedList {

    void add(Comparable value);

    void add(int index, Comparable o);

    void set(int index, Comparable o);

    Comparable get(int index);

    int size();

    boolean equals(ImprovedList other);

    String toString();

    Comparable[] toArray();

    boolean contains(Comparable obj);

    void remove(int index);

    void remove(Comparable obj);

    void clear();

    boolean isEmpty();



}
