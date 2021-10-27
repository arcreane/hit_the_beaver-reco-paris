package com.fass;

import java.util.Scanner;

public class ChoicePlayer {
    public static void displayMainMenu() {
        String easy ="Easy";
        String medium ="Medium";
        String hard ="Hard";
        String error ="Error";

        Scanner input = new Scanner(System.in);
        System.out.println("To start the game you had to choose among the following levels :\n\"Easy\"\n\"Medium\"\n\"Hard\" ");
        System.out.println("Please choose the level you want");
        String userinput = input.nextLine();
        // We applied a while loop so that an error message appears for any entry outside of "Easy","Medium"and"Hard"
        while (userinput.equals("Easy")||userinput.equals("Medium")||userinput.equals("Hard")){
        }
        System.out.println("Please, write again your choice");
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
