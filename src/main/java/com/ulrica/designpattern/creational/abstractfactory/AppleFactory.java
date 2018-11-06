package com.ulrica.designpattern.creational.abstractfactory;


public class AppleFactory implements FoodAbstractFactory {
    public Color getColor() {
        return new AppleColor();
    }

    public Smell getSmell() {
        return new AppleSmell();
    }
}
