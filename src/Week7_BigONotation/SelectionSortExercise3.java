package Week7_BigONotation;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSortExercise3 {
    public static void main(String[] args)
    {
        String[] arrayOfNames = { "Carlos", "Octavio", "David", "Abraham", "Jasmine", "Jordan", "Daniel"};
        System.out.println(Arrays.toString(genericSelectionSort(arrayOfNames)));
    }
    public static int[] selectionSort(int[] arr)
    {
        int swapIndex = 0;
        int smallIndex = 0;
        int temp;

        while(swapIndex < arr.length-1)
        {
            int smallest = arr[swapIndex];
            for(int i = swapIndex; i < arr.length; i++)
            {
                if(arr[i] <= smallest){
                    smallest = arr[i];
                    smallIndex = i;
                }
            }
            temp = arr[swapIndex];
            arr[swapIndex] = smallest;
            arr[smallIndex] = temp;
            swapIndex++;
        }
        return arr;
    }

    public static <E extends Comparable<E>> E[] genericSelectionSort(E[] arr)
    {
        int swapIndex = 0;
        int smallIndex = 0;
        E temp;

        while(swapIndex < arr.length-1)
        {
            E smallest = arr[swapIndex];
            for(int i = swapIndex; i < arr.length; i++)
            {
                if(arr[i].compareTo(smallest) <= 0)
                {
                    smallest = arr[i];
                    smallIndex = i;
                }
            }
            temp = arr[swapIndex];
            arr[swapIndex] = smallest;
            arr[smallIndex] = temp;
            swapIndex++;
        }
        return arr;
    }

    public static <E> void genericSelectionSort(E[] arr, Comparator< ? super E> comparator)
    {
        int swapIndex = 0;
        int smallIndex = 0;
        E temp;

        while(swapIndex < arr.length-1)
        {
            E smallest = arr[swapIndex];
            for(int i = swapIndex; i < arr.length; i++)
            {
                if(comparator.compare(arr[i], smallest) <= 0)
                {
                    smallest = arr[i];
                    smallIndex = i;
                }
            }
            temp = arr[swapIndex];
            arr[swapIndex] = smallest;
            arr[smallIndex] = temp;
            swapIndex++;
        }
    }
}
