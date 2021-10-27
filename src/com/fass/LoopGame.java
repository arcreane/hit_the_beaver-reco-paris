package com.fass;

import java.util.Random;

public class LoopGame {
    //Creation of loops to show the beaver and the timer
    public static void displayLoop() {
        String[][] array;
         int width = 1;

        //array initialization
                array = new String[ width][width];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = "  ";
                    }
                }
        Random rand = new Random();

    }
}
