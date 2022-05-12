package Week7_BigONotation;

import java.util.Comparator;

public class BubbleSortExercise1<E,V> implements Comparable<E>, Comparator<V> {
    public E[] bubbleSort(E[] arr)
    {
        boolean sorted = false;
        int pass = 0;
        while(!sorted)
        {
            sorted = true;
        }
        for(int i = 1; i < arr.length - pass; i++)
            if(arr[i-1] > arr[i])
                int temp = arr[i - 1];





        return arr;
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }

    @Override
    public int compare(V o1, V o2) {
        return 0;
    }
}
