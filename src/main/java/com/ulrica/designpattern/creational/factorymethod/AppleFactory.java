package com.ulrica.designpattern.creational.factorymethod;

public class AppleFactory extends FoodEatFactory{
    public Food getFood() {
        return new Apple();
    }
}
