package com.ulrica.designpattern.creational.factorymethod;

/**
 * 抽象工厂模式
 * 对应源码 Collection中iterator,URLStreamHandlerFactory,logback LoggerFactory
 * 工厂方法模式通过抽象工厂，让类的实例化推迟到子类中进行，符合开闭原则
 */
public class Test {

    public static void main(String[] args) {
        FoodEatFactory foodEatFactory = new AppleFactory();
        Food food = foodEatFactory.getFood();
        food.eat();
    }
}
