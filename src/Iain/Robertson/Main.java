package Iain.Robertson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numberOfRows = 4;

        patternOne(numberOfRows);
        patternTwo(numberOfRows);
        patternThree(numberOfRows);
        patternFour(numberOfRows);

        Assignment2 game = new Assignment2();
        game.letsPlayAGame();
//        DayTwoAssignment1 day2AssignOne = new DayTwoAssignment1();
//        day2AssignOne.commandLineAddition();
        System.out.println(Arrays.toString(args));
    }

    public static void patternOne(int number) {
        String output = "";
        System.out.println("1)");

        for (int i = 0; i < number; i++) {
            output += "*";
            System.out.println(output);
        }
        System.out.println(".........");
    }

    public static void patternTwo(int number) {
        String output = "";
        int count = 0;
        System.out.println("2)");
        System.out.println("..........");

        for (int i = number; i > 0; i--) {
            for (int l = 0; l < number - count; l++) {
                output += "*";
            }
            System.out.println(output);
            output = "";
            count++;
        }
    }

    public static void patternThree(int number) {
        System.out.println("3)");
        int limit = number * 2;

        for (int i = 0; i < limit; i = i + 2) {
            System.out.print(" ");
           for (int l = limit - i; l > 1; l = l - 2) {
               System.out.print(" ");
           }
           for (int l = 0; l <= i; l++) {
               System.out.print("*");
           }
            System.out.println();
        }
        System.out.println("...........");

    }

    public static void patternFour(int number) {
        System.out.println("4)");
        System.out.println("............");
        int modifyNumber = number + 2;

        for (int i = modifyNumber; i > -2; i = i - 2) {
            System.out.print("  ");
            for (int l = modifyNumber - i; l > 1; l = l - 2) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
