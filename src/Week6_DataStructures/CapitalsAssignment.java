package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        String capital = "Sacramento";
//        int counter = 0;
//        while(counter < 100) {
//            int randIndex = (int) (capital.length() * Math.random());
//            System.out.println(randIndex);
//            counter++;
//        }
        String retrieval = "" + scramble(capital);
        System.out.println(retrieval);
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


//    public static String scramble(String capital)
//    {
//     int randIndex = (int) (capital.length() * Math.random());
//    }

    public static String scramble(String capital)
    {
        char[] capitalArrayForm = new char[capital.length()];
        for(int i = 0; i < capital.length(); i++)
        {
            capitalArrayForm[i] = capital.charAt(capital.length() - 1);

        }

        int counter = 0;
        while(counter < capital.length())
        {
            Collections.shuffle(Collections.singletonList(capitalArrayForm));
            counter++;
        }
        String scrambledCapital = "";

        while(capitalArrayForm.length > 0)
        {
            scrambledCapital = scrambledCapital + capitalArrayForm[0];
        }
        return scrambledCapital;
    }
}
