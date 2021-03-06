package com.fass;

import java.util.Scanner;

//Creation of the game menu
public class Menu {
    public static void displayMainMenu() {
        System.out.println("Welcome to the Hit The Beaver 🔨💥");
        System.out.println("Make your choice");
        System.out.println("S-StartGame");
        System.out.println("V-See scores");
        System.out.println("Q-Quits");

        Scanner scan = new Scanner(System.in);
        String selection = scan.nextLine();
        selection = selection.toLowerCase();
        switch (selection) {
            case "s" -> ChoicePlayer.displayMainMenu();
            case "v" -> HighScores.display_score();
            case "q" -> ChoicePlayer.displayMainMenu();

        }

    }

}
