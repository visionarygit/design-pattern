package com.ulrica.designpattern.creational.builder;

/**
 * 厨师做饭
 */
public class Cook {

    public Food makeFood(double salt, double sweet){
        FoodBuilder foodBuilder = new FoodBuilder();
        foodBuilder.saltBuilder(salt);
        foodBuilder.sweetBuilder(sweet);
        return foodBuilder.makeFood();
    }
}
