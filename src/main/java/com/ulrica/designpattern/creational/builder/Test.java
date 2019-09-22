package com.ulrica.designpattern.creational.builder;

public class Test {

    public static void main(String[] args) {
        Cook cook = new Cook();
        Food food = cook.makeFood(0.3d, 0.5d);
        System.out.println(food);
    }
}
