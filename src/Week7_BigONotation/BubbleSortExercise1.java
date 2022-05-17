package Week7_BigONotation;

import java.util.Arrays;
import  java.util.Comparator;

public class BubbleSortExercise1{
    public static void main(String[] args)
    {
        int[] arrayOfInts = {20, 1, 33, 100, 5, 234, 7};
        String[] arrayOfNames = { "Carlos", "Octavio", "David", "Abraham", "Jasmine", "Jordan", "Daniel"};

        System.out.println(Arrays.toString(genericBubbleSort(arrayOfNames)));
        //System.out.println(Arrays.toString(bubbleSort(arrayOfInts)));
    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted = false; //sorted boolean flag
        int pass = 0; //keep track of each pass
        while(!sorted) //while sorted is false
        {
            sorted = true; //assume array is sorted (if swap happens set to false)
            for(int i = 1; i < arr.length - pass; i++)
            {
                if(arr[i-1] > arr[i]) //if previousNumber > nextNumber
                {
                    //swap neighboring elements
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    sorted = false; //array not sorted yet
                }
            }
            pass++;
        }
        return arr;
    }

    public static <E extends Comparable<E>> E[] genericBubbleSort(E[] arr)
    {
        boolean sorted = false;
        int pass = 0;
        while(!sorted)
        {
            sorted = true;
            for(int i = 1; i < arr.length - pass; i++)
            {
                if(arr[i - 1].compareTo(arr[i]) > 0) //change
                {
                    E temp = arr[i - 1]; //change
                    arr[i - 1] = arr[i]; //change
                    arr[i] = temp; //change

                    sorted = false;
                }
            }
            pass++;
        }
        return arr;
    }

    public static <E> void bubbleSort1(E[] arr, Comparator< ? super E> comparator)
    {
        boolean sorted = false;
        int pass = 0;
        while(!sorted)
        {
            sorted = true;
            for(int i = 1; i < arr.length - pass; i++)
            {
                if(comparator.compare(arr[i], arr[i + 1]) > 0)
                {
                    E temp = arr[i - 1]; //change
                    arr[i - 1] = arr[i]; //change
                    arr[i] = temp; //change

                    sorted = false;
                }
            }
            pass++;
        }
    }

}
