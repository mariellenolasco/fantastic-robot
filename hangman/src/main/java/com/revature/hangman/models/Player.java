package com.revature.hangman.models;

public class Player {
  private int life;

  public Player() { this.life = 6; }

  public Player(int life) { this.life = life; }

  public int getLife() { return life; }

  public void setLife(int life) { this.life = life; }
}
