/*Kharlo Pena
  Andrew Hawley
  09/10/2021*/

// A simple program designed as a text based adventure game

import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {

     welcome();
     battle();
     
    }
    public static void welcome() {

      System.out.print("Please enter your name: ");
      
      String userInput = getUserInput();
      
      System.out.println(String.format("\nWelcome to the game %s!", userInput));
  
    }

    public static void battle() {

      System.out.println("\nA skeleton appears! What will you do?\n");
      
      System.out.println("1.) Attack\n2.) Run\n");
    }

    public static String getUserInput() {

      Scanner input = new Scanner(System.in);

      String userInput = input.nextLine();

      input.close();

      return userInput;

    }
}