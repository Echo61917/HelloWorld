package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CapitalsAssignment {
    public static void main(String[] args)
    {
        HashMap<String, String> capNStates = readData("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//Week6_DataStructures//States_Capitals.csv");
        ArrayList<String> states = new ArrayList<>(capNStates.keySet());
        //System.out.println(capNStates.get("california"));

        //Make a random number between 0-50 to pick a random State(key) to choose.
        int randomInt = (int) (Math.random()*50);
        String state = states.remove(randomInt);
        System.out.println(state);

        System.out.println(capNStates.get(state));
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


//    public static String scramble(){};
}
