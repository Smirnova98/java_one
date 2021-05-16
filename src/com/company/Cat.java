package com.company;

public class Cat {
    public String name;
    public int age;

    public void run(int height, double temp, String roadName) {
        System.out.println("Я бегу на высоте " + height + " " + roadName + " " + temp);
    }

    public void jump() {
        if (name.equals("Морис")) {
            System.out.println("Бума лох");
        } else {
            System.out.println("Я прыгаю " + name);
        }
    }

    public String whenCatWillDie() {
        if (age > 10) {
            return "soon";
        } else {
            return "not soon";
        }
    }

    public String plusStrings(String a, String b) {
        return a + b;
    }
}
