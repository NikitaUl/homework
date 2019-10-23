package lesson2;

import java.util.*;

public class DIYarrayList<T> implements List {

    Object[] data;

    public DIYarrayList(){
        this.data = new Object[]{};
    }

    @Override
    public int size() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] a = c.toArray();
        int lenA = a.length;
        System.arraycopy(a,0,data,0,lenA);
        return data.length > 0;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public Object set(int index, Object element) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw  new UnsupportedOperationException();
    }
}
