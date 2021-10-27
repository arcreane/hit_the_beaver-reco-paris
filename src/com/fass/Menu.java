package com.fass;

import java.util.Locale;
import java.util.Scanner;

//Creation of the game menu
public class Menu {
    public static void displayMainMenu() {
        System.out.println("Welcome to the Hit The Beaver 🔨💥");
        System.out.println("Make your choice");
        System.out.println("S-StarGame");
        System.out.println("V-See scores");
        System.out.println("Q-Quits");

        Scanner scan = new Scanner(System.in);
        String selection = scan.nextLine();
        selection = selection.toLowerCase();
        if (selection.equals("s")) {
            ChoicePlayer.displayMainMenu();
        } else if (selection.equals("v")) {
            ChoicePlayer.displayMainMenu();
        } else if (selection.equals("q")) {
            ChoicePlayer.displayMainMenu();
        }

    }

}
