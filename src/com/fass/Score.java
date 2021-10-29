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
        }
        //Le score est plus grand que le plus petit des highscore,
        //on doit l'insérer dans le tableau
        else {
            for (int i = nbScoreEntered; i >=0; i--) {
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


//    int round_number_done = 0;
//    int new_score = 10;
//    int top5_case_number = 5;
//
//            for(i=1,i<round_number_done, i++)
//
//    {
//        if (scores_Array[i][2].equals(".")) {
//            scores_Array[i][2] = new_score;
//            round_number_done++;
//        } else {
//            sortArray()
//
//        }
//
//
//    }


//
//    private static void setupHighScores ( ) {
//        // trouver la valeur la plus petite du tableau:
//
//        int min = 0;
//        for (int i = 0; i < round_number_done; i++) {
//            for (int j = i + 1; j < round_number_done - 1; i++) {
//                if (scores[i] < scores[j] && scores[i] < min) {
//                    min.equals( scores[i]);
//                }
//            }
//        }

    // ajouter les prénom dans le tableau si le joueur souhaite que son score soit dans le top 5
    // et si le score est suffisament haut (Amal)
/*
    private static void choixAffichageTop5Joueur() {


        Scanner scannerChoix = new scanner(System.in);
        System.out.println("Voulez vous enregistrer votre score dans le top 5 ? Yes/No");
        Str choix = scanner.nextIn();

        if (choix("Yes") {
            Scanner prenom = new Scanner(System.in);
            System.out.println("Quel est votre prénom ? " +);
            String pseudo = scanner.next();
            sortArray();
        }

        // remplacer la valeur la plus petite par le nouveau score si il est supérieur

        if (min < new_score) {
            min = new_score
        }

        // trier le tableau
        private static void sortArray () {

            for (i = t[top5_case_number], i = 0, i++) {
                for (j = t[i - 1], j = t[i - 1], i++) {
                    if (t[j] < t[i]) {
                        tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }
                }
            }*/
        }


        // mettre en ligne le top 5 du meilleur score au plus bas




