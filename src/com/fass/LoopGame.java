package com.fass;

import java.util.Scanner;

//game board that turns 10 times
public class LoopGame {

        public static void playGame() {

            Scanner input = new Scanner(System.in);
            int score = 0;
            for(int round = 0; round < 10; round ++){
                TabGame.placeBeaver();
                TabGame.displayBoardGame();
                System.out.println("choose the coordinates to type the beaver - Line, Column : ");
                String lineColumnCoordinates = input.nextLine();
                if(TabGame.checkInputUser(lineColumnCoordinates))
                    score++;
                else{
                    TabGame.revealBeaverCoordinates();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //Fin de la boucle de jeu la partie est finie et on connait le score
            HighScores.enterNewHightScore(score);
        }
    }

