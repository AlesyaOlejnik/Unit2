package com.company;

public class Unit2Task8 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
