package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TreeMapExercise2 {
    public static void main(String[] args)
    {

        Map<String, Integer> map = new TreeMap<>();
        
        String[] words = readFileIntoArray("C://Users//Carlos//IdeaProjects//GitHub//src//Week6_DataStructures//ReadingandAnalyticalSkill.txt");
        for(int i = 0; i < words.length; i++)
        {
            String key = words[i].toLowerCase();

            if(key.length() > 0)
                if(!map.containsKey(key)){
                    map.put(key, 1);
                }
            else{
                int value = map.get(key);
                value++;
                map.put(key, value);
                }
        }
        map.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
    public static String[] readFileIntoArray (String filename)
    {
        try{
            File f = new File(filename);
            Scanner scan = new Scanner(f);

            ArrayList<String> text = new ArrayList<>();
            while(scan.hasNext()) {
                text.add(scan.next());
            }
            return text.toArray(new String[text.size()]);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Filename not found: " + filename);
            return null;
        }
    }
}