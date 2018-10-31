package com.ulrica.designpattern.creational.factorymethod;

public class PearFactory extends FoodEatFactory {
    public Food getFood() {
        return new Pear();
    }
}
