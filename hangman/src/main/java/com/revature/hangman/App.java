package com.revature.hangman;

import com.revature.hangman.models.Player;
import com.revature.hangman.services.HangmanService;

public class App {
  public static void main(String[] args) {
    Player player = new Player();
    HangmanService service = new HangmanService();
    Hangman hangman = new Hangman(player, service);
    hangman.startGame();
  }
}
