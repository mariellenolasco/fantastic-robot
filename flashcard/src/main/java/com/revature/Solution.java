package com.revature;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static HashMap<String, String> studyGuide = new HashMap<>();

    public static void populateCards(){
        // Using the put method to add in all the cards I want
        studyGuide.put("OOP", "Object Orient Programming");
        studyGuide.put("HTML", "HyperText Markup Language");
        studyGuide.put("CSS", "Cascading Style Sheets");
        studyGuide.put("SQL", "Structured Query Language");
        studyGuide.put("NPM", "Node Package Manager");
    }

    public static void main(String[] args) {

        populateCards();

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Flashcard Application!");

        /*
        The whole plan for now is to iterate over each entry and quiz the user. If they get it right we just say correct,
        but if they get it wrong, we need to store it somewhere, so I can use it again later. We do this by creating
        another map to hold the cards.
         */

        HashMap<String, String> incorrectCards = new HashMap<>();

        /*
        Since I realistically only ever want to loop over the studyGuide map, I'll update it after each round and just
        check to make sure the size is not zero.
         */
        while (studyGuide.size() != 0){

            // Here I loop over each entry, which is just each key value pair
            for(Map.Entry<String,String> entry: studyGuide.entrySet()){

                // To get the definition from the entry, I call the getValue() method
                System.out.println("Definition: \"" + entry.getValue() + "\"");

                // Taking in user input with some checking for extra spaces and inconsistent capitalization
                String input = scan.nextLine().trim().toLowerCase();

                // Checking for equality between the answer and the formatted key from the entry
                if (input.equals(entry.getKey().trim().toLowerCase())){
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The answer was \"" + entry.getKey() +"\"");

                    // Adding the key to the temporary map for this round
                    incorrectCards.put(entry.getKey(), entry.getValue());
                }
            }
            // Clear the initial study guide for this round
            studyGuide.clear();

            // Only add the incorrect values from this round back in
            studyGuide.putAll(incorrectCards);

            // Clear the temporary map, so it can be used again next round
            incorrectCards.clear();
        }

        // Closing statement to end the game
        System.out.println("You've studied every term!");

    }

}
