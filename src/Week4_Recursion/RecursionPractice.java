package Week4_Recursion;

import java.util.Arrays;

public class RecursionPractice {
    public static void main(String[] args)
    {
        System.out.println(length("apple"));

        int[] arr = {0, 2, 5, 10, 33};

        System.out.println(search(arr, 33));

        System.out.println(factorial(5));
    }

    public static int length(String str)
    {
        int counter = 0;
        if(str.length() == 0)
        {
            return counter;
        }
        else
        {
            counter++;
            return length(str.substring(1));
        }
    }

//    public static int search(int arr[], int item)
//    {
//        if(arr.length == 0)
//        {
//            return -1;
//        }
//        if(item == arr[0])
//        {
//            return 0;
//        }
//        else
//        {
//            return 1 + search(Arrays.copyOfRange(arr, 1, arr.length), item);
//        }
//    }

    public static int search(int arr[], int item) {
        int low = 0;
        int high = arr.length - 1;
        return search(arr, item, low, high);
    }
    private static int search(int[] arr, int item, int low, int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;

        if(item < arr[mid])
        {
            return search(arr, item, low, mid - 1);
        }
        else if(item == arr[mid])
        {
            return mid;
        }
        else{
            return search(arr, item, mid + 1, high);
        }
    }

    public static int factorial( int num)
    {
        if(num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }


}
