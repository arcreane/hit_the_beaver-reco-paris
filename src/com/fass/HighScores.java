package com.fass;

import java.util.Scanner;

public class HighScores {

    private static String s_sUserinput;
    static String[][] s_ScoresArray;;
    static int nbScoreEntered = 0;

    public static void setupHighScores() {
        //We initialize the table of the top 5 scores
        s_ScoresArray = new String[6][2];
        s_ScoresArray[0][0] = "nom";
        s_ScoresArray[0][1] = "score";

        for (int i = 1; i < s_ScoresArray.length; i++) {
            for (int j = 0; j < s_ScoresArray[i].length; j++) {
                s_ScoresArray[i][j] =".";
            }
        }
    }
    public static void display_score() {
        for (int i = 0; i < s_ScoresArray.length; i++) {
            for (int j = 0; j < s_ScoresArray[i].length; j++) {
                System.out.print(s_ScoresArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String getUserName() {
        Scanner input = new Scanner(System.in);
        // The loop while to check if the score is bigger than the minimum score
        do {
            System.out.println("What's your name ?(give at least 3 characters");
            s_sUserinput = input.nextLine();
        } while (s_sUserinput.length() < 3);
        return s_sUserinput;
    }

    public static void enterNewHightScore(int newHighScore) {
        // au debut, tant qu'il y a de la place dans le tableau, ajouter les scores

        //Cas où le score est plus petit que le plus petit des highscore
        if (Integer.valueOf(s_ScoresArray[nbScoreEntered][1]) > newHighScore) {
            //Si il reste de la place dans le tableau on rentre dans le premier
            // slot libre le nom du joueur et son score
            if (nbScoreEntered < 5) {
                s_ScoresArray[nbScoreEntered + 1] = new String[]{getUserName(), newHighScore + ""};
                //s_ScoresArray[nbScoreEntered + 1][0] = getUserName();
                //s_ScoresArray[nbScoreEntered + 1][1] = newHighScore + "";
            }
            //Sinon on ne fait rien, le tableau est plein et le score est trop faible
        }
        //Le score est plus grand que le plus petit des highscore,
        //on doit l'insérer dans le tableau
        else {
            for (int i = nbScoreEntered; i >= 0; i--) {
                // if
            }
            //      Integer.valueOf(scores_Array[nbScoreEntered][1])
        }
        //D'abord trouver où l'insérer

        //Ensuite décaler chaque score plus petit que le nouveau score
        //à la ligne suivante (Si il reste des slots libres on se place dessus pour le
        //début de notre boucle, sinon on se place sur la derniere ligne de notre tableau)


        //Et enfin entrer le nouveau score à l'index qui a été trouvé précédemment
    }

}




