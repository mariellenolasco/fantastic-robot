package com.revature.hangman;

import com.revature.hangman.models.Player;
import com.revature.hangman.services.HangmanService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hangman {
  private Player player;
  private HangmanService service;

  public Hangman(Player player, HangmanService service) {
    this.player = player;
    this.service = service;
  }

  public void startGame() {
    char input = ' ';
    Scanner scan = new Scanner(System.in);
    String word = service.getRandomWord();
    String unknown = service.hideWord(word);
    List<Character> chars = new ArrayList<>();

    while (!unknown.equals(word) && player.getLife() > 0) {
      try {
        // Draw the hangman
        service.draw();

        System.out.println("Word to guess: " + unknown);
        System.out.println("Life: " + player.getLife());
        System.out.println("Guessed characters: " + chars);

        System.out.print("Guess: ");
        input = Character.toLowerCase(scan.nextLine().charAt(0));

        // Only valid guesses
        if (Character.isLetter(input)) {
          // Only unique guesses
          if (!chars.contains(input)) {
            // Add guess to bank
            chars.add(input);
            Collections.sort(chars);

            // valid guess
            if (service.isValidGuess(word, input)) {
              System.out.println("\nCorrect guess!");

              unknown = service.updateWord(word, unknown, input);

            } else {
              System.out.println("\nIncorrect guess :(");
              // Lose life
              player.setLife(player.getLife() - 1);
            }
          } else {
            System.out.println("\nAlready guessed character");
          }
        } else {
          System.out.println("\nInput should only be letters ie. A-Z");
        }
      } catch (StringIndexOutOfBoundsException
                   ignore) { // If user accidentally hit 'enter' without
                             // entering in an input
        System.out.println("Invalid input");
      }
    }

    scan.close();
    System.out.println("The word was: " + word);
    if (service.isWin(player.getLife())) {
      System.out.println("YOU WIN!");
    } else {
      System.out.println("YOU LOSE!");
    }
  }
}
