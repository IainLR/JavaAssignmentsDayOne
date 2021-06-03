package Iain.Robertson;

import java.util.Locale;
import java.util.Scanner;

public class DayTwoAssignment1 {
    Scanner scanner = new Scanner(System.in);

    public void commandLineAddition() {
        int total = 0;
        boolean finished = false;
        System.out.println("We're going to do some addition");

        int userInput = getNumber("Please enter your first number\n");
        total += userInput;

        while (!finished) {
            userInput = getNumber("Enter another number\n");
            total += userInput;
            System.out.println("sum: " + total);
            finished = getYesOrNo("Would you like to continue adding? y/n\n");
        }

        System.out.printf("Your final total is %d%nhave a nice day%n", total);
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

    private Boolean getYesOrNo(String input) {
        while(true) {
            System.out.print(input);
            String userInput = scanner.nextLine().toLowerCase(Locale.ROOT);
            System.out.println(userInput);
            if (userInput.equals("y")) {
                return false;
            } else if (userInput.equals("n")) {
                return true;
            } else {
                System.out.println("Please answer 'y' or 'n'");
            }
        }
    }

}
