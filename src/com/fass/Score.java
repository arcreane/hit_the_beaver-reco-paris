package com.fass;

import java.util.Scanner;

public class Score {
    static int round_number_done;
    static String[][] scores_Array = new String[6][2];
    static int nbScoreEntered = 0;


    private static void main(String[] args) {
        setupHighScores();
        enterNewHightScore(1);
        //sortArray();
    }


    private static void setupHighScores() {
        // initialisation du tableau du top 5

        scores_Array[0][1] = "nom";
        scores_Array[0][2] = "score";

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 5; i++) {
                scores_Array[i][j].equals(".");
            }
        }
    }

    private static void enterNewHightScore(int newHighScore) {

        // au debut, tant qu'il y a de la place dans le tableau, ajouter les scores

        newHighScore = 7;
        //Cas où le score est plus petit que le plus petit des highscore
        if (Integer.valueOf(scores_Array[nbScoreEntered][1]) > newHighScore) {
            //Si il reste de la place dans le tableau on rentre dans le premier
            // slot libre le nom du joueur et son score
            if (nbScoreEntered < 5) {
                scores_Array[nbScoreEntered + 1][0] = "name";
                scores_Array[nbScoreEntered + 1][1] = newHighScore + "";

            }

            //Sinon on ne fait rien, le tableau est plein et le score est trop faible

            // si le score est plus grand que le plus petit des highscore,
            else {
                //on doit l'insérer dans le tableau (à la place du petit score qui devra etre decale
                // vers le bas
                for (int i = nbScoreEntered; i >= 0; i--) {
                    int indexMin = -1;
                    if (Integer.valueOf(scores_Array[i][1]) < newHighScore) {
                        if (Integer.valueOf(scores_Array[i][1]) < indexMin) {
                            indexMin = i;
                        }
                        for (int j = indexMin; j > nbScoreEntered; i--) {
                            scores_Array[j][1] = scores_Array[i - 1][1];


                        }

                        newHighScore = Integer.valueOf(scores_Array[indexMin][1]);

                    }


                }

            }
        }
    }
}