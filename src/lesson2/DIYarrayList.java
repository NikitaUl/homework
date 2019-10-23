package lesson2;

import java.util.*;

public class DIYarrayList<T> implements List {


    Object[] data = new Object[]{};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private int size;

    public DIYarrayList(){

        this.data = new Object[]{};
    }

    @Override
    public int size() {
        return size;
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

        Object[] arr = new Object[this.size+lenA];

        for (int i=0;i<this.size();i++){
            arr[i] = this.get(i);
        }

        if (this.size!=0){
            for(int i=this.size();i<this.size+lenA;i++){
                arr[i] = a[i-this.size()];
            }
        } else{
            for(int i=0;i<lenA;i++) {
                arr[i] = a[i];
            }
        }


        this.data = Arrays.copyOf(arr, arr.length);
        //System.arraycopy(a,0,this.data,0,1);
        this.size = arr.length;
        return this.data.length > 0;
    }


    static <T> void copy(List<? super T> dest, List<? extends T> src){
           dest.addAll(src);
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
        return data[index];
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
