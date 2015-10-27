package homeWork10.Lists;

/**
 * Created by igor on 24.10.15.
 */
public class ImprovedLinked implements ImprovedList {

    private ListElement head;

    @Override
    public void add(Comparable value) {
        if (head == null) {
            head = new ListElement(value);
        } else {
            ListElement current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListElement(value);
        }
    }

    @Override
    public void add(int index, Comparable o) {
        if (index == 0) {
            head.value = o;
        } else {
            ListElement beforeNewElement = head;
            for (int i = 1; i < index; i++) {
                beforeNewElement = beforeNewElement.next;
            }
            ListElement newElement = new ListElement(o);
            ListElement nextAfterNew = beforeNewElement.next;
            beforeNewElement.next = newElement;
            newElement.next = nextAfterNew;
        }
    }

    @Override
    public void set(int index, Comparable o) {

    }

    @Override
    public Comparable get(int index) {
        if (index == 0){
            return head.value;
        } else {
            ListElement current = head;
            for(int i =1; i <= index; i++){
                current = current.next;
            }
            return current.value;
        }
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        } else {
            ListElement current = head;
            int counter = 1;
            while (current.next != null) {
                counter++;
                current = current.next;
            }
            return counter;
        }
    }

    @Override
    public boolean equals(ImprovedArray other) {
        return false;
    }

    @Override
    public Comparable[] toArray() {
        return new Comparable[0];
    }

    @Override
    public boolean contains(Comparable obj) {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Comparable obj) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Comparable[] sort() {
        return new Comparable[0];
    }

    @Override
    public boolean containsForSorted(Comparable obj) {
        return false;
    }


    //inner class
    class ListElement {
        Comparable value;
        ListElement next;

        ListElement(Comparable value) {
            this.value = value;
        }
    }
}
