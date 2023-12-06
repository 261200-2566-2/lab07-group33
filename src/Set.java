import java.util.HashMap;

public class Set<E> {

    private final HashMap<E, Object> map;

    public Set() {
        map = new HashMap<>();
    }

    public boolean contains(E x) {
        return map.containsKey(x);
    }

    public void remove(E x) {
        map.remove(x);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }

    public void add(E x) {
        map.put(x,null);
    }
}