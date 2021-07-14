package com.company;

public class Unit2Task2 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i =3;i<=24;i = i+3){
            System.out.println("Количество амёб через " +i + " часов =  " + (sum *=2) );
        }
    }
}
