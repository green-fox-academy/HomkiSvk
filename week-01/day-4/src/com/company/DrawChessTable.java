package com.company;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        int size = 8; //size of a chessboard, can be substituted with custom input

        /*
        for (int i = 0; i < 8; i++) {
            if (i%2==0){
                System.out.println("% % % %");
            } else {
                System.out.println(" % % % %");
            }
        }

         */

        // after Maggie's CA

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i%2==0 && j%2==0) || (i%2==1 && j%2==1)){
                    System.out.print('%');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();

        }

    }
}
