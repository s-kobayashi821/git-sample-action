package com.example;

/**
 *
 */
public class MathUtil {
    public static double power(int num1, int num2){
        if(num1 >= 100 || num2 >= 100){
            throw new IllegalArgumentException("100以上の値は不正です");
        }
        return Math.pow(num1, num2);
    }

    public static int factorial(int i) {
        return  0;
    }
}
