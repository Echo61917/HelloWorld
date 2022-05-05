package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExercise2 {
    public static void main(String[] args)
    {
        //TreeMap source = readFileIntoArray("C://Users//Carlos//IdeaProjects//GitHub//src//Week6_DataStructures//ReadingandAnalyticalSkill.txt");

        TreeMap source = readFileIntoArray("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//Week6_DataStructures//SchoolFile.txt");
            System.out.println(source);

//       for(String s : source)
//            System.out.println(s);
    }
    public static TreeMap readFileIntoArray (String filename)
    {

        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);
            
            int counter = 0;
            
            Map<String, Integer> text = new TreeMap<>();
            while (scan.hasNext()) {
                text.put(scan.next(), counter);
//                if(text.containsKey(scan.next()))
//                {
//                    counter++;
//                }
            }
            return (TreeMap) text;

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Filename not found: " + filename);
            return null;
        }

    }
}
