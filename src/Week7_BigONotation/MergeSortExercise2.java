package Week7_BigONotation;

import java.util.Arrays;

public class MergeSortExercise2 {
    public static void mergeSort( int[] list )
    {
        if( list.length > 1 )
        {
            int[] firstHalf = new int[list.length/2];
            firstHalf = Arrays.copyOfRange( list, 0, list.length/2 );
            //System.out.println( Arrays.toString(firstHalf) );
            mergeSort( firstHalf );

            int secondHalfLength = list.length - list.length/2;
            int[] secondHalf = new int[secondHalfLength];
            secondHalf = Arrays.copyOfRange( list, list.length/2, list.length );
            //System.out.println( Arrays.toString(secondHalf) );
            mergeSort( secondHalf );

            merge( firstHalf, secondHalf, list);
        }
    }

    public static void merge( int[] list1, int[] list2, int[] temp )
    {
        int curr1 = 0;    //current index in list1
        int curr2 = 0;    //current index in list2
        int curr3 = 0;    //current index in temp

        while( curr1 < list1.length && curr2 < list2.length ) //compare element-for-element list1 and list2
        {
            if( list1[curr1] < list2[curr2] )
                temp[curr3++] = list1[curr1++];
            else
                temp[curr3++] = list2[curr2++];
        }

        while( curr1 < list1.length )       //add any remaining elements from list1
            temp[curr3++] = list1[curr1++];

        while( curr2 < list2.length )
            temp[curr3++] = list2[curr2++];  //add any remaining elements from list2

        //System.out.println( "****" + Arrays.toString( temp ) );
    }


}
