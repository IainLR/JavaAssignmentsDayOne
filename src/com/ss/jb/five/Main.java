package com.ss.jb.five;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        String[] aFewOfMyFavoriteStrings = {"Raindrops on Roses", "Whiskers on Kittens", "Woolen Mittens", "Brown Paper Packages"};
        String[] numStrings = {"1z", "1z2", "1z23", "12e34", "123e45"};

        lengthDescending(numStrings);
        lengthAscending(numStrings);
        arrayAlphabetically(aFewOfMyFavoriteStrings);

        Arrays.sort(numStrings,
                (a, b) -> ((a.contains("e") ? 0 : 1) - (b.contains("e") ? 0 : 1))
                );
        System.out.println(Arrays.toString(numStrings));

        Arrays.sort(numStrings, (a, b) -> eCharSort(a, b));
        System.out.println(Arrays.toString(numStrings));

        // question II
//        List<Integer> intList = new ArrayList<Integer>();
//        intList.add(3);
//        intList.add(52);
//        intList.add(17);
//        intList.add(88);
        Integer[] intList = {3, 52, 17, 88};
        qTwoEAndO(intList);

        // question III
        List<String> qThreeStrings = Arrays.asList("art", "ant", "ARK", "ale", "yay", "yup");

        System.out.println(qThree(qThreeStrings));

        //DateTimeQuestions:
        DateTimeQuestions dtq = new DateTimeQuestions();
        DateTimeQuestions.findThursday();
        DateTimeQuestions.zoneDateTimeInstantExample();
        DateTimeQuestions.lengthOfMonths(1977);
        DateTimeQuestions.mondaysInTheMonth(Month.JANUARY);

    }

    public static void lengthDescending( String[] arr) {
        Arrays.sort(arr,
                (String a, String b) -> Integer.signum(b.length() - a.length())
        );
        System.out.println(Arrays.toString(arr));
    }

    public static void lengthAscending(String[] arr) {
        Arrays.sort(arr,
                (String a, String b) -> Integer.signum(a.length() - b.length())
        );
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayAlphabetically(String[] arr) {
        Arrays.sort( arr,
                (String a, String b) -> a.compareTo(b)
                );
        System.out.println(Arrays.toString(arr));
    }

    public static int eCharSort(String a, String b) {
       return  (a.contains("e") ? 0 : 1) - (b.contains("e") ? 0 : 1);

    }

    public static void qTwoEAndO(Integer[] arr) {
        StringBuilder commaSeparatedResult = new StringBuilder();

        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                commaSeparatedResult.append("e").append(integer).append(", ");
            } else {
                commaSeparatedResult.append("o").append(integer).append(", ");
            }
        }
        System.out.println(commaSeparatedResult);

    }

    public static List<String> qThree(List<String> list) {
       return ( list
                .stream()
                .filter(string -> string.startsWith("a") && string.length() ==3)
                .collect(Collectors.toList())
        );
    }
}
