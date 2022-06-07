package HangmanCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordBank {

    public static void main(String[] args)
    {
        HashMap<String, String> wordBank = new HashMap<>();

        String[] words = readFileIntoArray("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//HangmanCode//mammals.csv");
        for(int i = 0; i < words.length; i++)
        {
            String key = words[i].toLowerCase();

            if(key.length() > 0)
                if(!wordBank.containsKey(key)){
                    wordBank.put(key, "");
                }
                else{
                    String hint = wordBank.get(key);
                    wordBank.put(key, hint);
                }
        }
        wordBank.forEach((k, v) -> System.out.println(k + "\t" + v));

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
