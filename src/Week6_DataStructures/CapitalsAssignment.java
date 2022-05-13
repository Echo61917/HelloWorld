package Week6_DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CapitalsAssignment {
    public static void main(String[] args)
    {
        HashMap<String, String> capNStates = readData("C://Users//cramirez17//Documents//GitHub//HelloWorld//src//Week6_DataStructures//States_Capitals.csv");
        ArrayList<String> states = new ArrayList<>(capNStates.keySet());
        //System.out.println(capNStates);

        int score = 0;
        int maxScore = 250;
        Scanner wordChecker = new Scanner(System.in);
        String gameState = "";
        boolean wordVerified = true;
        String capital = null;
        String state = null;

        int randomInt = (int) (Math.random() * capNStates.size());

            while (!gameState.equalsIgnoreCase("quit")) {
                if(capNStates.isEmpty() == true)
                {
                    System.out.println("You guessed all the capitals!");
                    if(score == maxScore)
                    {
                        System.out.println("You also got all of them correct! Good job!");
                    }
                    else
                    {
                        System.out.println("Your final score was: " + score);
                    }
                    break;
                }
                if (wordVerified == true) {
                    randomInt = (int) (Math.random() * capNStates.size());
                    //Make a random number between 0-50 to pick a random State(key) to choose.
                    state = states.get(randomInt);
                    capital = capNStates.get(state);
                }

                System.out.println("Guess the capital of the state printed. (Word is scrambled)");
                System.out.println("Score: " + score + "\n" + "State: " + state + "\n" + "Capital: " + scramble(capNStates.get(state)));
                gameState = String.valueOf(wordChecker.nextLine());
                if (gameState.equalsIgnoreCase(capital)) {
                    score += 5;
                    states.remove(randomInt);
                    capNStates.remove(state);
                    wordVerified = true;
                } else {
                    wordVerified = false;
                    score -= 2;
                    scramble(capNStates.get(state));
                }
            }
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
