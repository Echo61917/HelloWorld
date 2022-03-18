package Week4_Recursion;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class RecursiveMethod {
    public static void main(String[]args)
    {
        //test recursiveBinarySearch
        int[] descending = {91, 83, 76, 54, 22, 20, 18, 14, 11, 9, 3};
        int key = 87;
        int index = recursiveBinarySearch( descending, key );

        if( index < 0 ){
            System.out.println( key + " is not in the array." );
        }else{
            System.out.println( key + " is element " + index + " of array." );
        }

        int m = 100;
        int n = 15;
        System.out.println("Greatest common divisor of " + m + " and " + n + " is " + gcd(m,n));

        String word = "mississippi";
        String letter = "i";
        System.out.println(word + " has " + count(word, letter) + " " + letter + "'s.");

        int num = 2677591;
        System.out.println("The sum of the digits of " + num + " is " + sum(num));

    }
    //recursiveBinarySearch - public method that invokes a private, helper, recursive method by the same name.
    // Refer to the notes for an example that requires an array in ascending order.
    // Your implementation should require and array sorted in descending order.
    public static int recursiveBinarySearch(int[] arr, int key)
    {
        int low = 0;
        int high = arr.length - 0;
        return recursiveBinarySearch(arr, key, low, high);
    }
    private static int recursiveBinarySearch(int[] arr, int key, int low, int high)
    {
        //get middle index value
        int mid = (low + high)/2;
        //code base case for key not in array
        if(low > high)
        {
            return -1;
        }
        /*code base case and recursive calls for
         * key < arr[mid]  (recursive call)
         * key == arr[mid]
         * key > arr[mid]  (recursive call)
         */
        if(key > arr[mid])
        {
            return recursiveBinarySearch(arr, key, low, mid - 1);
        }
        else if(key == arr[mid])
        {
            return mid;
        }
        else
        {
            return recursiveBinarySearch(arr, key, mid + 1, high);
        }
    }

    //gcd - the method takes two integer parameters, m and n, a4nd
    // returns the greatest common divisor of m and n.
    public static int gcd(int m, int n)
    {
        if(m%n == 0)
        {
            return n;
        }
        else
        {
            return gcd(n, m%n);
        }
    }
    //count - a recursive method that returns the number of
    //occurrences of a specified letter in a String.
    public static int count (String word, String letter)
    {
        int counter = 0;
        if(word.length() == letter.length() && word.charAt(0) == letter.charAt(0))
        {
            return counter += 1;
        }
        else if(word.charAt(0) == letter.charAt(0))
        {
            return counter + 1 + count(word.substring(1), letter);
        }
        else if(word.length() > letter.length())
        {
            return count(word.substring(1), letter);
        }
        else
        {
            return 0;
        }
    }


    public static int sum( int num )
    {
        //get last digit of num (use the modulus operator)
        int rem = num%10;
        //reduce num through integer division
        int reduce = num/10;
        if( reduce == 0 && rem == 0 ){
            return 0;
        }else{
            //place recursive call to sum with reduced integer
            //add digit and return
            return  sum(reduce) + rem;
        }
    }

}
