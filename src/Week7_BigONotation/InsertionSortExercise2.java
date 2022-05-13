package Week7_BigONotation;

import java.text.spi.CollatorProvider;
import java.util.Arrays;
import java.util.Comparator;

public class InsertionSortExercise2 {

    public static void main(String[] args)
    {
        String[] arrayOfNames = { "Carlos", "Octavio", "David", "Abraham", "Jasmine", "Jordan", "Daniel"};
        System.out.println(Arrays.toString(genericInsertionSort(arrayOfNames)));
    }

    public static int[] insertionSort( int[] arr ){

        //traverse array from second element to end
        for( int i = 1; i < arr.length; i++){

            int unsortedElement = arr[i]; //store unsorted element (it will be lost when shifting happens)
            int k;
            /* traverse sorted sublist right-to-left until:
             * kth element is not greater than unsorted element or
             * start of list is reached */
            for( k = i-1; k >= 0 && arr[k] > unsortedElement; k-- ){
                arr[k+1] = arr[k];   //shift sorted elements one spot to the right
            }
            arr[k+1] = unsortedElement;   //insert unsorted element into sorted sublist
        }
        return arr;
    }

    public static <E extends Comparable<E>> E[] genericInsertionSort(E[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            E unsortedElement = arr[i];
            int k;
            for(k = i - 1; k >= 0 && arr[k].compareTo(unsortedElement) > 0; k--)
            {
                arr[k+1] = arr[k];
            }
            arr[k+1] = unsortedElement;
        }
        return arr;
    }

    public static <E> void genericInsertionSort(E[] arr, Comparator< ? super E> comparator)
    {
        for(int i = 1; i < arr.length; i++)
        {
            E unsortedElement = arr[i];
            int k;
            for(k = i - 1; k >= 0 && comparator.compare(arr[k], unsortedElement) > 0; k--)
            {
                arr[k+1] = arr[k];
            }
            arr[k+1] = unsortedElement;
        }
    }


}
