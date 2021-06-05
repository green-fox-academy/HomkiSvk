/*      Vytvořte jednoduchou kalkulačku. Program se postupně uživatele dotáže na operaci tak, že 1 odpovídá součtu, 2 rozdílu, 3 součinu a 4 podílu.
        Po volbě operace se program dotáže na dva operandy, které korektně označí podle zvolené operace - tj. pro součet se dotáže na sčítance,
        pro rozdíl na menšence a menšitele, pro součin na činitele a pro podíl na dělence a dělitele. Posledním vstupem programu je počet
        desetinných míst, která se použijí na tisk výsledku.

        Volba operace očekává celé číslo (1, 2, 3, 4). Operandy jsou reálná čísla. Počet desetinných míst je celé kladnénezáporné číslo.

        Program musí ošetřit případné dělení nulou, či volbu nepodporované operace.

        Formát výstupu je: “operand1 operátor operand2 = výsledek” Tak, že operandy i výsledek jsou formátovány na zadaný počet desetinných míst.

        priklad:
        Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):
        Zadej scitanec:
        Zadej scitanec:
        Zadej pocet desetinnych mist:_
        priklad 2:
        Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):
        3
        Zadej cinitel:
        12.345678
        Zadej cinitel:
        1.23456
        Zadej pocet desetinnych mist:
        3
        12.346 * 1.235 = 15.241
*/

package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusCalculator {

    static String createPattern (int decimal){
        return "#." + "0".repeat(decimal);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operation;
        double num1;
        double num2;
        int decimal;
        DecimalFormat formatter;

        System.out.println("This is a basic calculator, which can operate with numbers between: " + Double.MIN_VALUE + " and " + Double.MAX_VALUE + ".\n" +
                "There are 4 options to choose from (represented by numbers): \n1- Addition\n2- Subtraction\n3- Multiplication\n4- Division\n" +
                "Choose which one u want to use:");
        operation = scan.nextInt();

        while ((operation> 4 || operation<1)){
            System.out.println("U need to choose number between 1 and 4. Try again:");
            operation = scan.nextInt();
            if (operation>=1 && operation<=4){
                break;
            }
        }
        switch (operation) {
            case 1:
                System.out.println("Give me the first number for addition:");
                num1 = scan.nextDouble();
                System.out.println("Give me the second number for addition:");
                num2 = scan.nextDouble();
                System.out.println("How many decimals?");
                decimal = scan.nextInt();
                formatter = new DecimalFormat(createPattern(decimal));
                System.out.println(formatter.format(num1) + " + " + formatter.format(num2) + " = " + formatter.format((num1 + num2)));
                break;
            case 2:
                System.out.println("Give me the first number for subtraction:");
                num1 = scan.nextDouble();
                System.out.println("Give me the second number for subtraction:");
                num2 = scan.nextDouble();
                System.out.println("How many decimals?");
                decimal = scan.nextInt();
                formatter = new DecimalFormat(createPattern(decimal));
                System.out.println(formatter.format(num1) + " - " + formatter.format(num2) + " = " + formatter.format((num1 - num2)));
                break;
            case 3:
                System.out.println("Give me the first number for multiplication:");
                num1 = scan.nextDouble();
                System.out.println("Give me the second number for multiplication:");
                num2 = scan.nextDouble();
                System.out.println("How many decimals?");
                decimal = scan.nextInt();
                formatter = new DecimalFormat(createPattern(decimal));
                System.out.println(formatter.format(num1) + " * " + formatter.format(num2) + " = " + formatter.format((num1 * num2)));
                break;
            case 4:
                System.out.println("Give me the first number for division:");
                num1 = scan.nextDouble();
                System.out.println("Give me the second number for division:");
                num2 = scan.nextDouble();
                while (num2 == 0) {
                    System.out.println("U can not divide by 0. Try again.");
                    num2 =scan.nextDouble();
                    if (num2!=0){
                        break;
                    }
                }
                System.out.println("How many decimals?");
                decimal = scan.nextInt();
                formatter = new DecimalFormat(createPattern(decimal));
                System.out.println(formatter.format(num1) + " / " + formatter.format(num2) + " = " + formatter.format((num1 / num2)));
            default:
        }
    }
}








