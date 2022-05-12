package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CapitalAssignmentTestMethods {
    public static void main(String[] args)
    {
        String capital = "Sacramento";

        System.out.println(scramble(capital));

    }

    public static String scramble(String capital)
    {
        String copyString = "";
        int capLength = capital.length();

        for(int i = 0; i < capLength; i++) {
            //Create a random number (rand) between 0 and the length of the capital (non-inclusive)
            int randIndex = (int) (Math.random() * capital.length());
            //Add the character at index value "rand" to an empty String
            copyString += capital.charAt(randIndex);
            //Remove the character at index value "rand" from the capital with the substring method
            capital = capital.substring(0, randIndex) + capital.substring(randIndex + 1);
            //Repeat steps 1-3 until the length of the capital is 0
        }
        return copyString;
    }

    public static HashMap<String, String> readData(String filename){
        //exception handling
        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);

            HashMap<String, String> data = new HashMap<>();

            while(scan.hasNextLine()) {
                String[] line = scan.nextLine().toLowerCase().split(",");
                data.put(line[0], line[1]);
            }
            return data;
        }
        catch(FileNotFoundException e){
            System.out.println(filename + " not found.");
            return null;
        }
    }

}
