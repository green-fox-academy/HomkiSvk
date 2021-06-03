package com.company;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double aSide = 10;
        double bSide = 10;
        double cSide = 10;

        System.out.println("Sides: " +(int)aSide+" "+(int)bSide+" "+(int)cSide);

        System.out.println("Surface Area: " + (int)((2* (aSide*bSide)) + (2*(bSide*cSide)) + (2*(cSide*aSide))));
        System.out.println("Volume: " + (int)(aSide*bSide*cSide));

    }
}

