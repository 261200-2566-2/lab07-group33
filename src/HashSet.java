import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSet<E> implements Set<E>{
    HashMap<E,Object> map;
    int size;
    int cap;

    public HashSet(int cap){
        this.cap = cap;
        map = new HashMap<>(cap);

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator iterator() {
        Iterator<E> iterator = map.keySet().iterator();
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Object next() {
                return iterator.next();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }



    @Override
    public boolean add(E e) {
        if(size >= cap && contains(e)) return false;
        map.put(e,new Object());
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(map.get(o) == null) return false;

        map.remove(o);
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object o : c){
            if(!map.containsKey(o)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(Object o : c){
            if(!map.containsKey(o)) return false;
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean done = false;
        for(E e : map.keySet()){
            if(!c.contains(e)){
                map.remove(e);
                size--;
                done = true;
            }
        }
        return done;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean done = false;
        for(Object o : c){
            if(map.containsKey(o)){
                map.remove(o);
                size--;
                done = true;
            }
        }
        return done;
    }

    @Override
    public void clear() {
        map.clear();
    }
}