package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("テストを実行する");
    }

    @Test
    void testPower1(){
        double actualAnswer = MathUtil.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります。");
    }

    @Test
    void testPower2(){
        double actualAnswer = MathUtil.power(2, 0);
        assertEquals(1, actualAnswer, "TC2:期待値と実際の結果が異なります");
    }

//    @Test
//    void testPower3(){
//        double actualAnswer = MathUtil.power(1000, 2);
//        IllegalAccessException exception = assertThrows(IllegalAccessException.class, ()-> MathUtil.power(100, 0));
//        assertEquals("100以上の値は不正です", exception.getMessage(), "TC3:期待値と実際の結果が異なります");
//    }

}