package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExercise1 {
    public static void main(String[] args)
    {
        String [] source = readFileIntoArray("C://Users//Carlos//IdeaProjects//GitHub//src//Week6_DataStructures//ReadingandAnalyticalSkill.txt");
        for(String s : source)
            System.out.println(s);
    }
    public static String[] readFileIntoArray (String filename)
    {

        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);

            TreeSet<String> text = new TreeSet<>();
            while (scan.hasNext()) {
                text.add(scan.next());
            }
            return text.toArray(new String[text.size()]);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Filename not found: " + filename);
            return null;
        }

    }
}
