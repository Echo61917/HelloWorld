package Week6_DataStructures;

import java.io.File;
import java.util.HashMap;

public interface CapitalsNStates {
    //First read in the CSV File and store the states(key) and capitals (value) in a Hash Map.

    //Randomly pick a state from the map and display the corresponding captial to the user in scrambled fashion

    //The user should then guess the capital correctly before another capital, at random, is displayed to
    //the user.

    //To make it more interesting, assign a point system to the game.
    //A correct guess increments the user's score by 5 points, while an incorrect guess decrements the user's score by 2 points.

    //If the user guesses every capital correctly on their first try, the maximum score the user can achieve is 250 points.

    //Allow the user to keep guessing until they enter "quit" or they've guessed all fifty capitals correctly

    /*
        Notes:
    When a capital is guessed correctly, the capital along with its corresponding state should be removed from the map. This will prevent the same capital and state from being displayed more than once.

    To randomize the selection of the capital, consider adding the states to a data structure whose elements can be removed at random by their index value.

    When a incorrect guess is made, scramble the capital name again to provide the user a different perspective on the letters that make up the name of the capital.

    To scramble the capital name consider using the random method in the Math class, the charAt and substring methods of the String class. The algorithm could be as follows:

    Create a random number (rand) between 0 and the length of the capital (non-inclusive)
    Add the character at index value "rand" to an empty String
    Remove the character at index value "rand" from the capital with the substring method
    Repeat steps 1-3 until the length of the capital is 0
     */

    //Methods needed
    //readData(filename) -> returns a map with key (States), and value (Capitals) entries
    public HashMap<String, String> readData(File filename);
    //scramble(capital) -> returns the scrambled name of the capital
    public String scramble(String capital);
    //main -> void (main program execution)

}
