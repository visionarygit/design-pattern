package com.ulrica.designpattern.creational.builder;

public class FoodBuilder {

    private Food food = new Food();

    public void saltBuilder(double salt) {
        food.setSalt(salt);
    }

    public void sweetBuilder(double sweet) {
        food.setSweet(sweet);
    }

    public Food makeFood() {
        return food;
    }
}
