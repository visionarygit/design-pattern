package com.ulrica.designpattern.creational.singlefactory;

/**
 * 简单工厂模式
 * JDBC-DriverManager、Calendar、LoggerFactory（logback）
 */
public class Test {

    public static void main(String[] args) {
        Food food = FoodEatFactory.getFood("apple");
        if (food != null) {
            food.eat();
        }
        Food food1 = FoodEatFactory.getFood(Pear.class);
        if (food1 != null) {
            food1.eat();
        }
    }
}
