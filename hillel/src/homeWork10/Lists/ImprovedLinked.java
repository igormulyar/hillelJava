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
            ListElement temp = head;
            head = new ListElement(o);
            head.next = temp;
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
        if (index == 0){
            head.value = o;
        } else {
            ListElement current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.value = o;
        }
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
    public boolean equals(ImprovedList other) {
        if (!(other instanceof ImprovedLinked)){
            return false;
        }
        if (this.size() != other.size()){
            return false;
        }
        for (int i=0; i<size(); i++){
            if (this.get(i) != other.get(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (!this.isEmpty()){
            ListElement current = head;
            String str = current.value.toString() +" ";
            for (int i=1; i<this.size(); i++){
                current = current.next;
                str +=current.value.toString()+" ";
            }
            return str;
        } else {
            return "list is empty";
        }

    }

    @Override
    public Comparable[] toArray() {
        int arrSize = this.size();
        Comparable[] array = new Comparable[arrSize];
        ListElement current = head;
        for (int i =0; i<arrSize; i++){
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }

    @Override
    public boolean contains(Comparable obj) {
        ListElement current = head;
        for (int i=0; i<this.size();i++){
            if (current.value.compareTo(obj) == 0){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void remove(int index) {
        if (index == 0){
            head = head.next;
        } else {
            ListElement beforeDeleted = head;
            for (int i=0; i<index-1; i++){
                beforeDeleted = beforeDeleted.next;
            }
            beforeDeleted.next = beforeDeleted.next.next;
        }
    }

    @Override
    public void remove(Comparable obj) {
        if (head.value.compareTo(obj) == 0){
            head = head.next;
        } else {
            ListElement current = head;
            ListElement beforeCurrent = null;
            while(current.value.compareTo(obj) != 0){
                beforeCurrent = current;
                current = current.next;
            }
            beforeCurrent.next  = beforeCurrent.next.next;
        }
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if (head == null){
            return true;
        }
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
