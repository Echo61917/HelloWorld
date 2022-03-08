package Week4_Recursion;

public class Factorial {
    public static void main(String[] args)
    {
        long num = 15;
        long answer = factorial(num);
        System.out.println("Factorial of " + num + " is " + answer);
    }

    public static long factorial(long n)
    {
        //base case (0! = 1) (The base case will take us from the winding phase -> unwinding phase)
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
}
