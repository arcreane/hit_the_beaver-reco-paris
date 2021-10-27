package com.fass;

import java.util.Scanner;

//Display of tables
public class TabGame {
    public static void displayTab(String[] args) {
        int[][] easy;
        int[][] medium;
        int[][] hard;
        int x, y;

        easy = new int[5][5];
        for (int i = 0;i < easy.length; i++) {
            for (int j = 0;j < easy[i].length;j++) {
                easy[i][j] = i + j;
                if (i == 0 || j == 0)
                System.out.print(easy[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        medium = new int[7][7];
        for (int i = 0;i < medium.length; i++) {
            for (int j = 0;j < medium[i].length;j++) {
                medium[i][j] = i + j;
                if (i == 0 || j == 0)
                System.out.print(medium[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        hard = new int[10][10];
        for (int i = 0;i < hard.length; i++) {
            for (int j = 0;j < hard[i].length;j++) {
                hard[i][j] = i + j;
                if (i == 0 || j == 0)
                System.out.print(hard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
