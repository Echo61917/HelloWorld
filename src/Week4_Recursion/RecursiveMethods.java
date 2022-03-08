package Week4_Recursion;

public class RecursiveMethods {
    public static void main(String[] args)
    {
        int answer = power(2,3);
        System.out.println(answer);

        String string = "answer";
        System.out.println(reverse(string));
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

}
