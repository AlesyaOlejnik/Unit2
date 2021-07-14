package com.company;

public class Unit2Task7 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            result = result + i;
        }
        System.out.println("сумма всех нечетных чисел = " + result);
    }
}
