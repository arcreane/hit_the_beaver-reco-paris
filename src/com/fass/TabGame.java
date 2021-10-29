package com.fass;

import java.lang.Math;

//Creation of the table with the choice of size
public class TabGame {
    static String[][] s_BoardGame;
    static int width = 0;
    static int s_iLineBeaver = 0;
    static int s_iColumnBeaver = 0;

    public static void createBoardGame(String userSelect) {
        //selection of the game level
        if (userSelect.equals("Easy"))
            width = 6;
        else if (userSelect.equals("Medium"))
            width = 8;
        else if (userSelect.equals("Hard"))
            width = 11;
        else
            return;
        //initialize the board
        s_BoardGame = new String[width][width];
        for (int i = 0; i < s_BoardGame.length; i++) {
            for (int j = 0; j < s_BoardGame[i].length; j++) {
                s_BoardGame[i][j] = "  ";
            }
        }
    }

    //Random positioning of the beaver
    public static void placeBeaver() {
        s_BoardGame[s_iLineBeaver][s_iColumnBeaver] = "  ";
        s_iLineBeaver = (int) (Math.random() * width - 1) + 1;
        s_iColumnBeaver = (int) (Math.random() * width - 1) + 1;
        s_BoardGame[s_iLineBeaver][s_iColumnBeaver] = "B ";
    }

    //Display of the board
    public static void displayBoardGame() {
        StringBuilder gridContent = new StringBuilder();
        for (int line = 0; line < s_BoardGame.length; line++) {
            for (int column = 0; column < s_BoardGame[line].length; column++) {
                if (line == 0)
                    gridContent.append(column + " ");
                else if (column == 0)
                    gridContent.append(line + " ");
                else
                    gridContent.append(s_BoardGame[line][column]);
            }
            gridContent.append("\n");
        }
        System.out.println(gridContent.toString());
    }
    // Check the coordinates of player
    public static boolean checkInputUser(String coordinates) {
        String[] arrayLineColumn = coordinates.split(",");
        if (arrayLineColumn[0].equals(s_iLineBeaver + "") && arrayLineColumn[1].equals(s_iColumnBeaver + ""))
            return true;

        return false;
    }
    // reveal the coordinates of beaver
    public static void revealBeaverCoordinates() {
        System.out.println("Beaver was in " + s_iLineBeaver + " , " + s_iLineBeaver);
    }
}
