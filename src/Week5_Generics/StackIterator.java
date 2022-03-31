package Week5_Generics;

import java.util.Iterator;

public class StackIterator<E> implements Iterator<E> {
    //fields for list to iterate across, current element, current index
    private GenericStack<E> stack;
    private E current;
    private int index = 0;

    //constructor initializes stack and current element (the 0th element)
    public StackIterator( GenericStack<E> stack )
    {
        this.stack = stack;
        this.current = stack.get(index);
    }

    //returns true if current element is not null, false otherwise
    public boolean hasNext(){
        return current != null;
    }

    //returns the value of the current element and moves current to next element
    public E next(){
        E elem = current;
        this.index++;
        current = stack.get(this.index);
        return elem;
    }
}
