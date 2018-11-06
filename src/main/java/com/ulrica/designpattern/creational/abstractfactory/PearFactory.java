package com.ulrica.designpattern.creational.abstractfactory;

public class PearFactory implements FoodAbstractFactory {
    public Color getColor() {
        return new PearColor();
    }

    public Smell getSmell() {
        return new PearSmell();
    }
}
