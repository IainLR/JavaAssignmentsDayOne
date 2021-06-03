package com.ss.jb.two;



public class Main {

    public static void main(String[] args) {
        // Assignment 1:
        dayTwoAssignmentOne(args);

        // Assignment 2:
        int[][] myMatrix = { { 0, 4, 2, 12 },
                { 25, 5, 23, 1 },
                { 4, 8, 1, 99 },
                { 7, 0, 3, 11 } };
        System.out.println(dayTwoAssignmentTwo(myMatrix));
        System.out.println();

        // Assignment 3:
        Circle myCircle = new Circle(4);
        myCircle.display();
    }

    public static void dayTwoAssignmentOne(String[] args) {
        int sum = 0;
        StringBuilder nonNumbers = new StringBuilder();

        for (String a : args) {
            try {
                sum += Integer.parseInt(a);
            } catch (Exception ignored) {
                nonNumbers.append(a).append(" ");
            }
        }

        System.out.println("Your Sum is: " + sum);
        System.out.println("your args which were not numbers: " + nonNumbers);
        System.out.println();
    }

    public static int dayTwoAssignmentTwo(int[][] matrix) {
        int matrixRowCount = matrix.length;
        int matrixColumnCount = matrix[0].length;

        int maxNumber = Integer.MIN_VALUE;
        int rowIndex = Integer.MIN_VALUE;
        int columnIndex = Integer.MIN_VALUE;

        for (int i = 0; i < matrixRowCount; i++) {
            for (int l = 0; l < matrixColumnCount; l++) {
                if (matrix[i][l] > maxNumber) {
                    maxNumber = matrix[i][l];
                    rowIndex = i;
                    columnIndex = l;
                }
            }
        }

        System.out.printf("The largest number in this 2D Array is: %d %n", maxNumber);
        System.out.printf("It can be found at coordinates: [%d][%d] %n", rowIndex, columnIndex);

        return maxNumber;
    }

}
