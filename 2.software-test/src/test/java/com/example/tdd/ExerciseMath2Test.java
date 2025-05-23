package com.example.tdd;

import com.example.ExerciseMath2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseMath2Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void _1を渡すと1が返る(){
        //準備
        ExerciseMath2 exerciseMath = new ExerciseMath2();

        //実行
        int actual = exerciseMath.factorial(1);

        //検証
        assertEquals(1, actual, "TC1:期待値と実際の結果が異なります");
    }

    @Test
    void _2を渡すと2が返る(){
        //準備
        ExerciseMath2 exerciseMath = new ExerciseMath2();

        //実行
        int actual = exerciseMath.factorial(2);

        //検証
        assertEquals(2, actual, "TC2:期待値と実際の結果が異なります");
    }

    @Test
    void _3を渡すと6が返る(){
        //準備
        ExerciseMath2 exerciseMath = new ExerciseMath2();

        //実行
        int actual = exerciseMath.factorial(3);

        //検証
        assertEquals(6, actual, "TC3:期待値と実際の結果が異なります");
    }

    @Test
    void _12を7渡すと479001600が返る(){
        //準備
        ExerciseMath2 exerciseMath = new ExerciseMath2();

        //実行
        int actual = exerciseMath.factorial(12);

        //検証
        assertEquals(479001600, actual, "TC4:期待値と実際の結果が異なります");
    }

    @Test
    void __0を渡すと例外が返る(){
        //準備

        //実行

        //検証
//        assertEquals();
    }
}