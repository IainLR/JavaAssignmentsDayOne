package com.ss.jb.wk1_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(54);
        myList.add(52);
        myList.add(-8);
        // 2:
        System.out.println(rightmostDigits(myList));
        // 3:
        System.out.println(multiplyByTwo(myList));
        //4:
        List<String> xStrings = Arrays.asList("ax", "bb", "cx");
        System.out.println(removeX(xStrings));
        //5:
        System.out.println(groupSumClump(0, new int[]{2, 4, 8}, 10));
        System.out.println(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
        //6:
        //see SampleSingleton.Java


    }

    public static List<Integer> rightmostDigits(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();

        for (Integer integer : list) {
            returnList.add(integer % 10);
        }
        return returnList;
    }

    public static List<Integer> multiplyByTwo(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();

        for (Integer integer : list) {
            returnList.add(integer * 2);
        }
        return returnList;
    }

    public static List<String> removeX(List<String> list) {
        List<String> returnList = new ArrayList<>(Collections.emptyList());

        for (String string : list) {
            String modString = string.replaceAll("[Xx]","");
            returnList.add(modString);
        }

        return returnList;
    }

    public static boolean groupSumClump(int start, int[] arr, int sumGoal ) {
//        System.out.println(Arrays.toString(arr));
        if(start >= arr.length)
            return sumGoal == 0;

        int i = start;
        int sum = 0;

        while(i < arr.length && arr[start] == arr[i]) {
            sum += arr[i];
            i++;
        }

        if(groupSumClump(i, arr, sumGoal - sum)) {
            return true;
        }

        return groupSumClump(i, arr, sumGoal);
    }

}

