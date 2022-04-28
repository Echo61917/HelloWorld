package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SetsNMaps_CollabNotes {
    public static void main(String[] args)
    {
        String [] source = readFileIntoArray("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//Week6_DataStructures//ReadingandAnalyticalSkills.txt");
        for(String s : source)
            System.out.println(s);
    }
    public static String[] readFileIntoArray (String filename)
    {

        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);
            if(scan.hasNextLine() == false)
            {
                System.out.println("File is empty");
            }
            ArrayList<String> text = new ArrayList<>();
            //System.out.println(scan.next());
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
