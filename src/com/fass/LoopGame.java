package com.fass;

import java.util.Random;
import java.lang.Math;

//Creation of loops to show the beaver and the timer
public class LoopGame {
        public static void play() {
            int score = 0;
            System.out.println("choose the coordinates to type the beaver - x, y");

            //La boucle de jeu
            TabGame.displayTab(0);


            // generate random number
            int r = 10;

            System.out.println(Math.round(r));

            //Fin de la boucle de jeu la partie est finie et on connait le score
            HighScores.enterNewHightScore(score);
        }
    /*static double i = Math.random();
    static double j = Math.random();

    static String Beaver = "B";
    static int point = 0;

    public static void displayLoop() {
          System.out.println(i);
          i++;
          System.out.println(j);
          j++;

        }*/
        /*String[][] array;
         int width = 1;

        //array initialization
                array = new String[ width][width];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = "  ";
                    }
                }
        Random rand = new Random(10);*/
    }

