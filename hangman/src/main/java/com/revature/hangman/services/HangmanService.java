package com.revature.hangman.services;

import java.util.List;
import java.util.Random;

public class HangmanService {

  public void draw() {
    System.out.println("\n######################");
    System.out.println("# WELCOME TO HANGMAN #");
    System.out.println("######################\n");
  }

  public String getRandomWord() {
    String[] arr = {"java",   "typescript", "css",      "angular", "react",
                    "spring", "eslint",     "prettier", "html",    "python",
                    "lua",    "vim",        "github",   "git",     "vscode"};
    int index = new Random().nextInt(arr.length);
    return arr[index];
  }

  public String hideWord(String word) {
    String unknown = "";
    for (int i = 0; i < word.length(); i++) {
      unknown += "*";
    }
    return unknown;
  }

  public String updateWord(String word, String unknown, char input) {
    StringBuilder sb = new StringBuilder(unknown);

    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == input) {
        sb.setCharAt(i, input);
      }
    }

    return sb.toString();
  }

  public boolean isValidGuess(String word, char input) {
    for (char c : word.toCharArray()) {
      if (c == input) {
        return true;
      }
    }
    return false;
  }

  public boolean isWin(int life) { return life != 0; }
}
