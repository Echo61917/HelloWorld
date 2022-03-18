package Week4_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class RecursiveMethods {
    public static void main(String[] args)
    {
       // int answer = power(2,3);
        //System.out.println(answer);

        //String string = "answer";
        //System.out.println(reverse(string));

        //int x = 13;
        //System.out.println(isPrime(x));
        //String name = "international";


//        boolean check;
//        System.out.println(find("international", "nation"));
//
//        int[] array = {3, 8, 52, 54, -4};
//
//        System.out.println(largest(array));

        int[] b = {8, 10, -34, 28, 7, -2};

        System.out.println(sum(b));
    }

    //Write a recursive method that returns a^b
    public static int power(int base, int exp) // 2, 3
    {
//        int value = 1;
//
//        for(int i = 0; i < exp; i++) //loops three times
//        {
//            value = value * base;
//        }
//        return value;
        //int value = 1;
        if(exp == 0)
        {
            return 1;
        }
        else
        {
            return base * power(base, exp-1);//What this is doing is that it is placing a base, then going back to the if(exp == 0) checking if exp == 0, then goes back and adds another base
        }
    }

    public static String reverse(String str)
    {
        if(str.length() == 1)
        {
            return str;
        }
        else
        {
            return reverse(str.substring(1)) + str.charAt(0); //This is cutting the string at index 1, then adding the chartAt 0.
            /*
            answer when cut is nswer + a = nswera
            then
             */
        }
    }

    //isPrime - returns true if n is a prime number
    //13 can it be divided by 12? No
    //13 can it be divided by 11? No
    //13 can it be divided by 10? No
    //13 can it be divided by 9? No
    //13 can it be divided by 8? No
    //13 can it be divided by 7? No

    public static boolean isPrime(int n)
    {
        return isPrime(n, n/2);
    }
    private static boolean isPrime(int n, int i)
    {
        //base case - if i gets to 1 then n is prime
        if(i == 1)
        {
            return true;
        }
        else if(n % i == 0)
        {
            return false;
        }
        else
            return  isPrime(n, i -1);

    }

    public static boolean find(String text, String str)
    {
        if(text.substring(0, str.length()).equals(str))
        {
            return true;
        }
        //Checks if all letters and forms have been exhausted
        else if(text.length() == str.length())
        {
            return false;
        }
        else
        {
            return find(text.substring(1), str);
        }
    }

    public static int largest (int[] array)
    {
        //check to see if there are only two elements in the array
        if (array.length == 2)
        {
            if (array[0] > array[1])
            return array[0];
            else
                return array[1];
        }
        else
        {
            if(array[0] > largest(Arrays.copyOfRange(array, 1, array.length)))
                return array[0];
            else
                return largest(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public static int sum(int[] container)
    {
        //Check to see if the array is only two numbers?
        if(container.length == 2)
        {
            return container[0] + container[1];
        }
        else
            return container[0] + sum(copyOfRange(container,1, container.length ));
    }


}
