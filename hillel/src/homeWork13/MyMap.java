package homeWork13;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by igor on 11.11.15.
 */
public class MyMap {

    private HashSet<Pair> set = new HashSet<>();
    private int count = 0;

    public void put(Object key, Object value){
        if (!this.containsKey(key)) {
            set.add(new Pair(key, value));
        }
        count++;
    }

    public Object get (Object key){
            for(Pair pair : set){
                if(pair.getKey()==key){
                    return pair.getValue();
                }
            }
        return null;
    }

    public boolean containsKey (Object key){
        for(Pair pair : set){
            if(pair.getKey()==key){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return count;
    }

    public Set keySet(){
        Set<Object> keySet = new HashSet<>();
        for(Pair pair : set){
            keySet.add(pair.getKey());
        }
        return keySet;
    }

    public Set entrySet(){
        return set;
    }


    private class Pair{
        private Object key;
        private Object value;

        public Pair(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (!key.equals(pair.key)) return false;
            if (value != null ? !value.equals(pair.value) : pair.value != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = key.hashCode();
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }
    }
}
