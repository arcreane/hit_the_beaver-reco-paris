package com.fass;

import java.util.Scanner;

public class ChoicePlayer {
    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("To start the game you had to choose among the following levels :\"Easy\", \"Medium\", \"Hard\" ");
        System.out.println("Please choose the level you want");
        String userinput = input.nextLine();

        // We applied a while loop because we just want to accept uniquely "Easy", "Medium" or "Hard
        while (!userinput.equals("Easy") && !userinput.equals("Medium") && !userinput.equals("Hard")) {
            System.out.println("Please, enter your choice again");
            userinput = input.nextLine();
        }

        System.out.println("You choose the level " + userinput);

        // We used if because we want to have the choice of the player between "Easy", "Medium" or "Hard"
        TabGame.createBoardGame(userinput);
        LoopGame.playGame();
    }


}
