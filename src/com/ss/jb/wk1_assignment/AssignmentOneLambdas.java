package com.ss.jb.wk1_assignment;

interface PerformOperation {
    boolean check(int num);
}

public class AssignmentOneLambdas {

    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return num -> java.math.BigInteger.valueOf(num).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome() {
        return num -> Integer.toString(num)
                .equals( new StringBuilder(Integer.toString(num)).reverse().toString());
    }



}
