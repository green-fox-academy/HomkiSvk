package com.company.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file's content

        Path pathO = Path.of("win-o.txt");

        //creation of the encrypted file for the method to work properly
        try {
            Files.writeString(pathO, """                            
                    OXO
                    OXX
                    OOX""");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"
/*
        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));*/
        // Should print "Draw"
    }

    private static String ticTacResult(String s) {
        String winner = "Draw";
        List<String> board = new ArrayList<>();

        //writing chars to board with line check for winner
        try {
            try  (BufferedReader boardLine = new BufferedReader(new FileReader(Path.of(s).toFile()))) {
                int i=0;
                String line;
                while ((line = boardLine.readLine()) != null) {
                    if(line.equals("OOO")){
                        winner = "O";
                        break;
                    } else if (line.equals("XXX")){
                        winner = "X";
                        break;
                    }else {
                        board.add(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // checking in the board for winner
        StringBuilder patternRow = new StringBuilder();
        for (int i = 0; i < board.size(); i++) {
            patternRow.append(board.get(i).charAt(i));
        }
        if(patternRow.equals("OOO")){
            winner = "O";
        } else if (patternRow.equals("XXX")){
            winner = "X";
        }

        return "The winner is " +winner;
    }
}