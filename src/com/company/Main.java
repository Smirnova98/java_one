package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "hhoi";
        cat.age = 11;

        if (cat.whenCatWillDie().equals("soon")) {
            System.out.println("Кот скоро умрет");
        }
        cat.jump();


        String bbb = cat.plusStrings("Морис", " Смирнов");

        System.out.println(bbb);





    }
}
