/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;

import java.util.Scanner;

public class Test1 {

  public static final String RED = "\033[0;31m";
  public static final String BLUE = "\033[0;34m";
  public static final String Yallow = "\033[0;33m";
  public static final String GREEN = "\033[0;32m";
  public static final String Purble = "\u001B[35m";
  public static final String White = "\u001B[0m";

  private int x;
  private int y;
  private char[][] game;
  public char player = 'R';
  Scanner input = new Scanner(System.in);
  boolean chick = true;
  boolean chick1 = true;

  public Test1(int x, int y) {

    this.x = x;
    this.y = y;

    game = new char[x][y];

    for (int i = 0; i <= x - 1; i++) {

      for (int j = 0; j <= y - 1; j++) {

        game[i][j] = '*';

      }
    }
    ;
  }

  public void printGame() {

       System.out.print(BLUE + "  |  " + White);

     for (int k = 1; k <= y; k++) {

   
        System.out.print(GREEN + k + BLUE + "  |  " + White);
        
      }

       System.out.print('\n');


    for (int i = 0; i <= x - 1; i++) {

      System.out.print(BLUE + "  |  " + White);

      for (int j = 0; j <= y - 1; j++) {

        if (game[i][j] == 'R')
          System.out.print(RED + game[i][j] + BLUE + "  |  " + White);
        else if (game[i][j] == 'Y')
          System.out.print(Yallow + game[i][j] + BLUE + "  |  " + White);
        else if (game[i][j] == '*')
          System.out.print(Purble + game[i][j] + BLUE + "  |  " + White);

      }

      System.out.print('\n');

      for (int k = 0; k <= y; k++) {

        System.out.print(BLUE + "  |   " + White);
      }

      System.out.print('\n');

    }
    ;
  };

  public void switchPlayer() {

    if (player == 'R') {
      player = 'Y';
    } else {
      player = 'R';
    }
  }

  public boolean chickWin(int i, int j) {

    if (i + 3 <= x - 1) {
      if (game[i][j] == player && game[i + 1][j] == player && game[i + 2][j] == player && game[i + 3][j] == player) {
        return true;
      }
    }

    if (i - 3 >= 0) {
      if (game[i][j] == player && game[i - 1][j] == player && game[i - 2][j] == player && game[i - 3][j] == player) {
        return true;
      }
    }

    if (j + 3 <= y - 1) {
      if (game[i][j] == player && game[i][j + 1] == player && game[i][j + 2] == player && game[i][j + 3] == player) {
        return true;
      }
    }

    if (j - 3 >= 0) {
      if (game[i][j] == player && game[i][j - 1] == player && game[i][j - 2] == player && game[i][j - 3] == player) {
        return true;
      }
    }

    if (i + 3 <= x - 1 && j + 3 <= y - 1) {
      if (game[i][j] == player && game[i + 1][j + 1] == player && game[i + 2][j + 2] == player
          && game[i + 3][j + 3] == player) {
        return true;
      }
    }

    if (i + 3 <= x - 1 && j - 3 >= 0) {
      if (game[i][j] == player && game[i + 1][j - 1] == player && game[i + 2][j - 2] == player
          && game[i + 3][j - 3] == player) {
        return true;
      }
    }

    if (i - 3 >= 0 && j + 3 <= y - 1) {
      if (game[i][j] == player && game[i - 1][j + 1] == player && game[i - 2][j + 2] == player
          && game[i - 3][j + 3] == player) {
        return true;
      }
    }

    if (i - 3 >= 0 && j - 3 >= 0) {
      if (game[i][j] == player && game[i - 1][j - 1] == player && game[i - 2][j - 2] == player
          && game[i - 3][j - 3] == player) {
        return true;
      }
    }

    if (j + 2 <= y - 1 && j - 1 >= 0) {
      if (game[i][j] == player && game[i][j + 1] == player && game[i][j + 2] == player && game[i][j - 1] == player) {
        return true;
      }
    }

    if (j + 1 <= y - 1 && j - 2 >= 0) {
      if (game[i][j] == player && game[i][j + 1] == player && game[i][j - 1] == player && game[i][j - 2] == player) {
        return true;
      }
    }

    if (i - 2 >= 0 && j + 2 <= y - 1 && j - 1 >= 0 && i + 1 <= x - 1) {
      if (game[i][j] == player && game[i - 1][j + 1] == player && game[i - 2][j + 2] == player
          && game[i + 1][j - 1] == player) {
        return true;
      }
    }

    if (i + 2 <= x - 1 && j - 2 >= 0 && j + 1 <= y - 1 && i - 1 >= 0) {
      if (game[i][j] == player && game[i + 1][j - 1] == player && game[i + 2][j - 2] == player
          && game[i - 1][j + 1] == player) {
        return true;
      }
    }

    if (i - 2 >= 0 && j - 2 >= 0 && j + 1 <= y - 1 && i + 1 <= x - 1) {
      if (game[i][j] == player && game[i - 1][j - 1] == player && game[i - 2][j - 2] == player
          && game[i + 1][j + 1] == player) {
        return true;
      }
    }

    if (i - 1 >= 0 && j - 1 >= 0 && j + 2 <= y - 1 && i + 2 <= x - 1) {
      if (game[i][j] == player && game[i - 1][j - 1] == player && game[i + 1][j + 1] == player
          && game[i + 2][j + 2] == player) {
        return true;
      }
    }

    return false;
  }

  public boolean chickDraw() {

    for (int j = 0; j <= y - 1; j++) {

      if (game[0][j] == '*') {

        return false;
      }

    }

    return true;
  }

  public void Play() {
    printGame();
    int choice;
    do {
      System.out.println("player | " + player + " | inter number frome 1 to " + y);
      choice = input.nextInt();
      while (choice < 1 || choice > y) {
        System.out.println("please inter true value ");
        choice = input.nextInt();

      }
      choice--;
      for (int i = x - 1; i >= 0; i--) {

        if (game[i][choice] == '*') {

          game[i][choice] = player;
          printGame();
          chick = chickWin(i, choice);
          chick1 = chickDraw();

          if (chick1 == true) {
            System.out.println("the game fineshed draw ");
            return;
          }

          if (chick == true) {
            System.out.println("player | " + player + " | wins");
            return;

          } else {
            switchPlayer();
            break;
          }

        }

      }
    } while (chick == false && chick1 == false);

  }

  public static void main(String[] args) {

    Test1 level1 = new Test1(6, 7);

    level1.Play();

  }
}
