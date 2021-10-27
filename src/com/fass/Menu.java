package com.fass;

import java.util.Scanner;

public class Menu {
    public static void displayMainMenu() {
        System.out.println("Make your choice");
        System.out.println("S-StarGame");
        System.out.println("V-See scores");
        System.out.println("Q-Quits");

        Scanner scan = new Scanner(System.in);
        String selection = scan.nextLine();

        if(selection.equals("S")){
                ChoicePlayer.displayMainMenu();
        }

    }

}
