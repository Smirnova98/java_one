package com.company;

public class hi {
    public static void main(String[] args) {
        range();
        printIsNumberPositive(9);
       isNumberPositive (109);

    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static void range() {
        if (summ(8, 9) > 10 && summ(8, 9) <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printIsNumberPositive(int a) {
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }

    }

    public static boolean isNumberPositive(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }
}

