package homeWork10.Lists;

import Exceptions.myExceptions.WrongIndexException;

/**
 * Created by igor on 24.10.15.
 */
public interface ImprovedList {

    void add(Comparable value);

    void add(int index, Comparable o) throws Exception;

    void set(int index, Comparable o) throws Exception;

    Comparable get(int index) throws WrongIndexException;

    int size();

    boolean equals(ImprovedList other) throws WrongIndexException;

    String toString();

    Comparable[] toArray();

    boolean contains(Comparable obj);

    void remove(int index) throws WrongIndexException;

    void remove(Comparable obj);

    void clear();

    boolean isEmpty();



}
