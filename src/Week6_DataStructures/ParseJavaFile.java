package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParseJavaFile {
    public static void main(String[] args)
    {
        Stack<String> balance = new Stack<>();
        File f = new File("Car.java");
        try
        {
            Scanner scan = new Scanner(f);
            while(scan.hasNext())
            {
                String nextToken = scan.next();
                if(nextToken.contains("{"))
                    balance.push("{");
            }
            Scanner scan2 = new Scanner(f);
            while(scan2.hasNext())
            {
                String nextToken = scan.next();
                if(nextToken.contains("}"))
                    balance.pop();
            }
        }
        catch(FileNotFoundException e)
        {

        }
    }
}
