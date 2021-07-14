package com.company;

public class Unit2Task1 {
    public static void main(String[] args) {
        double rast = 10;
        double sum = 10;
        for (int i = 1; i < 7; i++) {
            rast *= 1.1;
            sum += rast;
        }
        System.out.println("Спортсмен всего пробежал " + sum);

    }
}
