package com.example;

public class ExerciseMath2
{

    public int factorial(int N) {

        int answer = 1;
        for(int i=1; i<=N; ++i){
            answer *= i;
        }

        return answer;
    }
}

