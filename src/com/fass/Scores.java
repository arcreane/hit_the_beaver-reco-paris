package com.fass;

import java.util.Scanner;

public class Scores {

    private static String userinput;
    int minimum_point = 5;
    static String[][] m_ScoresArray = new String[5][2];

    public static void display_score() {
        // We initialize score ans minimum_point to check our code.
        int score = 30;
        // Ajouter l'array des player
        //String[] ArrayPlayer = new String[5];
        // Ressortir que les scores des joueurs
        //  int tmpvar = player.getScore();
        // Recuperer score des joueurs
        //  Player[] playerArray = new Player[]; //ArrayPLayer

        for (int i = 0; i < m_ScoresArray.length; i++) {
            for (int j = 0; i < m_ScoresArray[i].length; i++) {
                System.out.print(m_ScoresArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void setScore(int score) {
        Scanner input = new Scanner(System.in);
        // The loop while to check if the score is biger than the minimum score
        while (score > minimum_point) {
            do {
                System.out.println("What's your name ?");
                userinput = input.nextLine();
            } while (userinput.length() < 1);
            break;
        }
        //
        if (userinput.length() > 1 && (score > minimum_point))
            System.out.println(userinput + ": " + score);
        else
            System.out.println("Please enter your name again to see your score");
            userinput = input.nextLine();
            m_ScoresArray[2][0] = userinput;

    }
    //private static void display_private(String args[][]);
    //String[] m_ScoresArray = new String[5][2];
}




