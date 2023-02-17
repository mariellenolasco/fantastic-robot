package com.revature;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Flashcard {

    // This is our studyGuide HashMap that will hold all our flashcards
    public static HashMap<String, String> studyGuide = new HashMap<>();

    public static void populateCards(){
        // Populate this method to fill out the HashMap with entries
    }

    public static void main(String[] args) {

        populateCards();

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Flashcard Application!");

        /*
         Everything from here down is up to you!

         You should loop over each entry in the HashMap and display the definition, then take in the term from the user
         and see if it matches what you have in the map. If you get it right we move on but if you get it wrong, we need
         to hold onto that entry and show it again until there are no remaining cards to study (meaning you got them all
         right).
         */


    }

}
