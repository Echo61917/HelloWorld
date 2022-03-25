package Week5_Generics;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerOperateOnArray{
    int[] list1;

    public IntegerOperateOnArray(int[] list1)
    {
        this.list1 = list1;
    }

    public void addNumbers()
    {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < list1.length; i++)
        {
            list1[i] = input.nextInt();
        }
    }

    public boolean isSorted()
    {
      for(int i = 0; i < list1.length - 1; i++)
      {
          if(list1[i] > list1[i + 1])
          {
              return false;
          }

      }
        return true;
    }




    @Override
    public String toString()
    {
        return "Array of Integers: "    + Arrays.toString(list1);
    }


}
