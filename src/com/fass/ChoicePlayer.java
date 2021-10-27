package com.fass;

import java.util.Scanner;

public class ChoicePlayer {
    public static void displayMainMenu() {
        String easy ="Easy";
        String medium ="Medium";
        String hard ="Hard";

        Scanner input = new Scanner(System.in);
        System.out.println("To start the game you had to choose among the following levels :\"Easy\", \"Medium\", \"Hard\" ");
        System.out.println("Please choose the level you want");
        String userinput = input.nextLine();

        if (userinput.equals(easy)) {
            System.out.println("You choose the level Easy");
        }

        else if (userinput.equals(medium)) {
            System.out.println("You choose the level Medium");
        }

        else if (userinput.equals(hard)) {
            System.out.println("You choose the level Hard");
        }

    }
}
