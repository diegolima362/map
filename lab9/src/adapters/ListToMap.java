package adapters;

import java.util.*;

public class ListToMap<E> implements List<E> {
    private final Map<Integer, E> map;
    private int key = 0;

    public ListToMap(Map<Integer, E> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsValue(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.values().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return map.values().toArray(a);
    }

    @Override
    public boolean add(E e) {
        return map.put(key++, e) != null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public E get(int index) {
        return map.get(map.values().toArray()[index]);
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, E element) {
        if (map.isEmpty() || key <= index)
            map.put(key++, element);
        else
            map.put((Integer) map.keySet().toArray()[index], element);
    }

    @Override
    public E remove(int index) {
        return map.remove((Integer) map.keySet().toArray()[index]);
    }

    @Override
    public boolean remove(Object o) {
        return map.values().remove(o);
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListToMap<?> listToMap = (ListToMap<?>) o;
        return key == listToMap.key &&
                Objects.equals(map, listToMap.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, key);
    }
}
