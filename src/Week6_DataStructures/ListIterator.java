package Week6_DataStructures;

import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {
    private List<E> list;
    private E current;
    private int index = 0;

    public ListIterator(List<E> list)
    {
        this.list = list;
        this.current = list.get(index);
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E elem = current;
        this.index++;
        current = list.get(this.index);
        return elem;
    }
}
