package Week7_BigONotation;

//Time complexity analysis of selection/insertion/bubble sort

import java.util.ArrayList;
import java.util.Arrays;

public class TimeComplexitySort {

    public static void main(String[] args)
    {
        int[] integers = new int[6];
        integers[0] = 100;
        integers[1] = 33;
        integers[2] = 47;
        integers[3] = 67;
        integers[4] = 83;
        integers[5] = 94;

//        int[] sorted = selectionSort(integers);
//        System.out.println(Arrays.toString(sorted));
//        int[] randomArray = makeArray(10);
//        System.out.println(Arrays.toString(randomArray));
//        int[] sorted2 = selectionSort(randomArray);
//        System.out.println((Arrays.toString(sorted2)));
        int elements = 50;

        while(elements < 10000) {
        int i = 0;
        int numSort = 200;
        int[][] arrays = new int[numSort][elements];




            for (int j = 0; j < arrays.length; j++) {
                arrays[j] = makeArray(elements);
            }
            long start = System.currentTimeMillis();
            while (i < numSort) {

                bubbleSort(arrays[i]);
                i++;
            }
            long stop = System.currentTimeMillis();

            double time = (stop - start) / (double) numSort;
            //System.out.printf("%.6f", time);
            System.out.println(elements + ", " + time);
            elements+= 50;
        }
    }
    public static int[] selectionSort(int[] arr){
        int swapIndex = 0;   //index value to place next smallest element
        int smallIndex = 0;  //index value of next smallest element
        int temp;            //temp variable used in swap

        while (swapIndex < arr.length-1 ){  //traverse array up to second-to-last element
            int smallest = arr[swapIndex];   //assume smallest element is at swapIndex
            //traverse array from swapIndex to end to find next smallest
            for( int i = swapIndex; i < arr.length; i++ ){
                if( arr[i] <= smallest ){  //if ith element is less than or equal to smallest
                    smallest = arr[i];   //update smallest with ith element
                    smallIndex = i;      //log location of smallest
                }
            }
            //perform swap
            temp = arr[swapIndex];
            arr[swapIndex] = smallest;
            arr[smallIndex] = temp;
            swapIndex++;   //increase swapIndex for next smallest
        }
        return arr;   //return sorted array
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

    public static int[] bubbleSort( int[] arr ){
        boolean sorted = false; //sorted boolean flag
        int pass = 0;           //keep track of each pass
        while( !sorted ){	//while sorted is false
            sorted = true; //assume array is sorted (if swap happens set to false)
            for( int i = 1; i < arr.length - pass; i++ ){
                if( arr[i-1] > arr[i] ){   //if previous > next
                    //swap neighboring elements
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    sorted = false;   //array not sorted yet
                }
            }
            pass++;
        }
        return arr;
    }

    public static int[] makeArray(int size)
    {
        //declare and initialize array size
        int[] randArray = new int[size];
        //traverse array and assign random numbers between 1 - size*size
        for(int i = 0; i < randArray.length; i++)
        {
            randArray[i] = (int) (Math.random()*(size*size) + 1);
        }
        //return array
        return randArray;
    }

}
