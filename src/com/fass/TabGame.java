package com.fass;

import java.util.Scanner;

//Creation of the table with the choice of size
public class TabGame {
    public static void displayTab(int choice) {
        //Choice of table size
        String[][] array;
        int width = 0;

        if (choice == 0)
            width = 5;
        else if (choice == 1)
            width = 7;
        else if (choice == 2)
            width = 10;

        //array initialization
        array = new String[ width][width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "  ";
            }
        }

        //table display
        StringBuilder gridContent = new StringBuilder();
        //array[8][6] = "M ";
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
        //array[8][6] = "  ";

        System.out.println(gridContent.toString());
    }
}
