package Iain.Robertson;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public  void letsPlayAGame() {

        int guessCount = 5;
        boolean correct = false;
        int answer = random.nextInt(100 - 1 + 1) + 1;
        String prompt = "Care to venture a guess?\n";
        System.out.println("I am thinking of a number between 1 and 100");

        while (guessCount > 0) {


            if (guessCount < 5) {
                prompt = "Sorry, that answer is incorrect. " + guessCount + " guesses remain\n";
                System.out.println();
            }

            int userGuessInt = getNumber(prompt);
            if (userGuessInt == answer) {
                System.out.printf("Congrats! the answer was %d. You Got it! %n", answer);
                guessCount = 0;
                correct = true;
            }
            if (userGuessInt < answer + 11 && userGuessInt > answer - 11 && answer != userGuessInt) {
                System.out.printf("Congrats! the answer was %d. Close enough! %n", answer);
                guessCount = 0;
                correct = true;
            }
            guessCount--;
        }
        if (!correct){

            System.out.printf("Sorry! You are out of guesses.%nthe answer was %d. %n", answer);
        }

        scanner.close();
    }

    private int getNumber(String input) {
        while(true) {
            System.out.print(input);
            String userInput = scanner.nextLine();
            try {
                return Integer.parseInt(userInput);
            } catch (Exception ignored) {
                System.out.printf("%s isn't a number%n", userInput);
            }
        }
    }

}
