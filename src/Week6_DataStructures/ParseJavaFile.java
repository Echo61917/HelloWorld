package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ParseJavaFile {
    public static void main(String[] args)
    {
        Stack<String> balance = new Stack<>();
        File f = new File("C://Users//Carlos//IdeaProjects//GitHub//src//Week5_Generics//Car.java");
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
                String nextToken = scan2.next();
                if(nextToken.contains("}"))
                    balance.pop();
            }
            if(balance.isEmpty())
            {
                System.out.println("File braces are balanced.");
            }
            else
            {
                System.out.println("File braces are not balanced, there is an extra brace.");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
