package Week6_DataStructures;

import java.io.*;
import java.util.Scanner;

public class ReadFileWithScanner
{
    public static void main(String[] args)
    {
        File file = new File("ReadFileWithScanner.java");
        try {

            Scanner scan = new Scanner(file);
            while(scan.hasNext())
            {
                System.out.println(scan.next());
            }
        }
        catch(FileNotFoundException e)
        {
            //This prints a list or trace of all the errors leading to the source
            //e.printStackTracer
            System.out.println("File not found.");
        }

    }


}
