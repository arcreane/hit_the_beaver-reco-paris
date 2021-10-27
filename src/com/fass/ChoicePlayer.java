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

        // We applied a while loop because we just want to accept uniquely "Easy", "Medium" or "Hard
        while (!userinput.equals("Easy") && !userinput.equals("Medium") && !userinput.equals("Hard")){
            System.out.println("Please, enter your choice again");
            userinput = input.nextLine();
        }

        // We used if because we want to have the choice of the player between "Easy", "Medium" or "Hard"
        if (userinput.equals(easy)) {
            System.out.println("You choose the level Easy");
            TabGame.displayTab(0);
        }

        else if (userinput.equals(medium)) {
            System.out.println("You choose the level Medium");
            TabGame.displayTab(1);
        }

        else if (userinput.equals(hard)) {
            System.out.println("You choose the level Hard");
            TabGame.displayTab(2);
        }
    }


}
