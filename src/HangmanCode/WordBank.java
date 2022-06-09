package HangmanCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordBank {

    public static void main(String[] args)
    {
        HashMap<String, String> wordBank = new HashMap<>();

        String[] words = readFileIntoArray("C://Users//Carlos//IdeaProjects//GitHub//src//HangmanCode//mammals.csv");
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++)
        {
//            String[] split = words[i].toLowerCase().split(",");
//            String key1 = split[0];
//            String value1 = split[1];
//            wordBank.put(key1, value1);

            String key = words[i].toLowerCase();
            String[] split = key.split(",");
            String key1 = split[0];
            String value = split[1];
            wordBank.put(key1, value);
//            if(key.length() > 0)
//                if(!wordBank.containsKey(key)){
//                    wordBank.put(key, "");
//                }
//                else{
//                    String hint = wordBank.get(key);
//                    wordBank.put(key, hint);
//                }
        }
        wordBank.forEach((k, v) -> System.out.println(k + "\t" + v));

       // String animal = wordBank.put("goat","mammal");

        //System.out.println(wordBank);

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
