package com.fass;

import java.awt.*;
import java.util.Scanner;
// this function will allow the player to choose his table level: easy, medium, hard.
public class ChoicePlayer {
    public static void displayMainMenu() {
        String easy = "Easy";
        String medium ="Medium";
        String hard ="Hard";

        Scanner input = new Scanner(System.in);
        System.out.println("To start the game you had to choose among the following levels :\"Easy = E\", \"Medium = M\", \"Hard = H\" ");
        System.out.println("Please choose the level you want");
        String userinput = input.nextLine();

        if (userinput.equals("E")) {
            System.out.println("You choose the level Easy");
            TabGame.displayTab(0);
        }

        else if (userinput.equals("M")) {
            System.out.println("You choose the level Medium");
            TabGame.displayTab(1);
        }

        else if (userinput.equals("H")) {
            System.out.println("You choose the level Hard");
            TabGame.displayTab(2);
        }
    }
}
