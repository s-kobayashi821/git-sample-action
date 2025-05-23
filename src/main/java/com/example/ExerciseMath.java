package com.example;

public class ExerciseMath
{
    /**
     * 引数Nの階乗を計算する
     *
     * @param N
     * @return Nの階乗
     */
    public static int factorial(int N){
        if(N <= 0){
            throw new IllegalArgumentException("0以下の値は不正です");
        }

        if(13 <= N){
            throw  new IllegalArgumentException("13以上の値は不正です");
        }

        int num=1;
        for(int i=1; i<=N; ++i){
            num *= i;
        }
        return num;
    }
}
