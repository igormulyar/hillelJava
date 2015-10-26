package collections;

/**
 * Created by IMulyar on 26.10.2015.
 */
public class RecursiveLinkedList {

    private ListElement head;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            return head.size();
        }

    }

    public void add(Object value) {
        if (head == null) {
            head = new ListElement(value);
        } else {
            head.add(value);
        }

    }

    public Object get(int index) {
        if (head == null) {
            return null;
        } else {
            return head.get(index);
        }
    }
}
