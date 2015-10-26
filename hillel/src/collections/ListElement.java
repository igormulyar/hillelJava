package collections;

/**
 * Created by IMulyar on 26.10.2015.
 */
public class ListElement {
    Object value;
    ListElement next;

    public ListElement(Object value) {
        this.value = value;
    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return 1 + next.size();
        }
        /*return next == null ? 1 : + next.size();*/
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListElement(value);
        } else {
            next.add(value);
        }
    }

    public Object get(int index) {
        if (index == 0) {
            return value;
        } else {
            return next.get(index - 1);
        }
    }
}
