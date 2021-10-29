package com.fass;

import java.util.Scanner;

public class Score {
    static int[] scores;
    static int round_number_done;


    private static void main(String[] args) {

        setupArray();
        setupHighScores();
        enterNewHightScore(1);
        sortArray();
    }

    private static void setupArray () {
        // initialisation du tableau du top 5

        int scores_Array = new int[][];
        scores_Array [0][1] = "nom";
        scores_Array [0][2] = "score";

        for (i=1, i<2; i++){
            for (j=0, j<5, i++) {
                scores_Array [i][j].equals(".");

            }
        }

        // ajouter les prénom dans le tableau si le joueur souhaite que son score soit dans le top 5
        // et si le score est suffisament haut

        // au debut, tant qu'il y a de la place dans le tableau, ajouter les scores
            int round_number_done = 0;
            int new_score = 10;
            int top5_case_number = 5;

            for (i=1, i< top5_case_number, i++ ) {
                    if (scores_Array[i][2].equals(".")) {
                        scores_Array[i][2] = new_score;
                        round_number_done++;
                    }
                else
                    {sortArray()

                }


            }

        }

    private static void setupHighScores ( ) {
        // trouver la valeur la plus petite du tableau:

        int min = 0;
        for (int i = 0; i < round_number_done; i++) {
            for (int j = i + 1; j < round_number_done - 1; i++) {
                if (scores[i] < scores[j] && scores[i] < min) {
                    min.equals( scores[i]);
                }
            }
        }

      // remplacer la valeur la plus petite par le nouveau score si il est supérieur

      if (min < new_score) {
          min = new_score}

      // trier le tableau
     private static void sortArray(){

        for (i = t[top5_case_number], i = 0, i++) {
            for (j = t[i - 1], j = t[i - 1], i++) {
                if (t[j] < t[i]) {
                    tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
    }



    // rentrer nom utilisateur fin du jeux si score assez haut

    Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ? "+);
        String pseudo = scanner.next();







    // mettre en ligne le top 5 du meilleur score au plus bas




