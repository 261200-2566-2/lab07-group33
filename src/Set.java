import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

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

    public void addAll(Collection<E> collection){
        for(E x : collection){
            add(x);
        }
    }

    public boolean containsAll(Collection<E> collection){
        for(E x : collection){
            if(!contains(x)){
                return false;
            }
        }
        return true;
    }

    public void removeAll(Collection<E> collection){
        for(E x : collection){
            remove(x);
        }
    }

    public void retainAll(Collection<E> collection){
        map.keySet().retainAll(collection);
    }

    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }
}