package com.fass;

import java.lang.Math;
import java.util.Random;
//Creation of the table with the choice of size
public class TabGame {
    double x = (int)(Math.random()*11);
    double y = (int)(Math.random()*11);
    static Object Beaver = "B";
    static String[][] array;

    public static void displayTabCreate(int choice) {
        //Choice of table size
        int width = 0;

        if (choice == 0)
            width = 6;
        else if (choice == 1)
            width = 8;
        else if (choice == 2)
            width = 11;

        //array initialization
        array = new String[width][width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "  ";
            }
        }

        //Table display
        StringBuilder gridContent = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0)
                    gridContent.append(j + " ");
                else if (j == 0)
                    gridContent.append(i + " ");
                else
                    gridContent.append(array[i][j]);
            }
            gridContent.append("\n");
        }
        System.out.println(gridContent.toString());
    }

        public static void displayTab() {
            //show the beaver

            StringBuilder gridContent = new StringBuilder();
            double x = (int)(Math.random()*11);
            double y = (int)(Math.random()*11);
            Beaver = "B";

                for (int u = 0; u < 10; u++ ){
                        gridContent.append(Beaver);


                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i == 0)
                                gridContent.append(i + " ");
                            else if (j == 0)
                                gridContent.append(j + " ");
                            else
                                gridContent.append(array[i][j] + Beaver);
                        }
                    }
                }
                gridContent.append("\n");
            //}
            //array[i][j] = "B";
            System.out.println(gridContent.toString() + Beaver);
            System.out.println(x+y);
        }
    }
