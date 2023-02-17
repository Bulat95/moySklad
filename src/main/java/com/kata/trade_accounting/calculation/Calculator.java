package com.kata.trade_accounting.calculation;

public class Calculator {
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum (int a, int b, int c){
        return a + b;
    }
    public int minus (int a, int b){
        return a - b;
    }
    public int div (int a, int b){
        if(b == 0){
            throw new ArithmeticException("Na nol` ne deli");
        }
        return a / b;
    }
    public int mult (int a, int b){
        return a * b;
    }
}
