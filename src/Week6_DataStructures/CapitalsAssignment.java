package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CapitalsAssignment {
    public static void main(String[] args)
    {
        HashMap<String, String> capNStates = readData("C://Users//Carlos//IdeaProjects//GitHub//src//Week6_DataStructures//States_Capitals.csv");
        ArrayList<String> states = new ArrayList<>(capNStates.keySet());

        int Score = 0;
        int maxScore = 250;
        Scanner wordChecker = new Scanner(System.in);
        String response = "";

        //Make a random number between 0-50 to pick a random State(key) to choose.
        int randomInt = (int) (Math.random()*50);
        String state = states.remove(randomInt);
        String capital = capNStates.get(state);

        while(!response.equalsIgnoreCase("quit") || capNStates.isEmpty() == true)
        {
            System.out.println("Guess the capital of the state printed. (Word is scrambled)");
            System.out.println("Score: " + Score + "\n" + "State: " + state + "\n" + "Capital: " + scramble(capNStates.get(state)));
            if(wordChecker.next().equalsIgnoreCase(capital))
            {
                Score += 5;

            }
            else
            {
                Score -= 2;
                scramble(capNStates.get(state));
            }
        }


        //System.out.println(state);

        //System.out.println(capNStates.get(state));
        //String capital = "Sacramento";
//        int counter = 0;
//        while(counter < 100) {
//            int randIndex = (int) (capital.length() * Math.random());
//            System.out.println(randIndex);
//            counter++;
//        }
        //String retrieval = scramble(capital);
        //System.out.println(retrieval);

        System.out.println("Score: " + "0" + "\n" + "State: " + state + "\n" + "Capital: " + scramble(capNStates.get(state)));


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
}
