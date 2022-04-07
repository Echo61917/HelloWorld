package Week6_DataStructures;

import Week5_Generics.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ReadFileWithScanner
{
    public static void main(String[] args)
    {
//        String workingDirectory = System.getProperty("user.dir");
//        workingDirectory = workingDirectory.replace("\\", "//");
//        workingDirectory += "/Week6_DataStructures//ReadFileWithScanner.java";
        ArrayList<String> container = new ArrayList<>();

        File file = new File("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//Week6_DataStructures//CarData.csv");
        try {

            Scanner scan = new Scanner(file);
            while(scan.hasNext())
            {
                container.add(scan.next());

                //System.out.println(scan.next());
            }


            //Car x = new Car(s1, s2, y);

            //Car newCar = new Car("lambo", "lamb", 2023);
            Collections.sort(container);

            for( String s : container)
            {
                System.out.println(s);
            }
        }
        catch(FileNotFoundException e)
        {
            //This prints a list or trace of all the errors leading to the source
            //e.printStackTracer
            System.out.println("File not found.");
        }

    }

    static class MakeComparator implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2)
        {
            return 0;
        }
    }

    static class ModelComparator implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2)
        {
            return s1.length();
        }
    }

    static class YearComparator implements Comparator<Integer>
    {
        @Override
        public int compare(Integer n1, Integer n2)
        {
            return 0;
        }

    }


}
