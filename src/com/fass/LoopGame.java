package com.fass;

import java.util.Random;
import java.lang.Math;

//Creation of loops to show the beaver and the timer
public class LoopGame {
    // generate random number
    static double i = Math.random();
    static double j = Math.random();

    static String Beaver = "B";
    static int point = 0;

    public static void displayLoop() {
          System.out.println(i);
          i++;
          System.out.println(j);
          j++;

        }
        String[][] array;
         int width = 1;

        //array initialization
                array = new String[ width][width];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = "  ";
                    }
                }
        Random rand = new Random(10);
    }

