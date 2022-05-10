package Week6_DataStructures;

import java.util.*;
import java.io.*;

public class LinkedHashSetExercise3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a text file name: ");
        String fileName = input.next();


        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("The file " + fileName + " does not exist.");
            System.exit(1);
        }


        Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int vowels = 0; // Counts the number of vowels
        int consonants = 0; // Counts the number of consonants


        try (Scanner inputFile = new Scanner(file);) {
            while (inputFile.hasNext()) {
                String line = inputFile.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (set.contains(Character.toUpperCase(line.charAt(i))))
                        vowels++;
                    else if (Character.isLetter(line.charAt(i)))
                        consonants++;
                }
            }
        }

        System.out.println("The file " + fileName + " has " + vowels +
                " vowels and " + consonants + " consonants.");
    }
}