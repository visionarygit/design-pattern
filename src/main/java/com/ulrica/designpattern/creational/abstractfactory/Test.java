package com.ulrica.designpattern.creational.abstractfactory;

/**
 * 定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，无需指定他们具体到类
 * 使用场景： 客户端（应用层）不依赖与产品类实例如何被创建、实现细节等
 *            强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复到代码
 *            提供一个产品类的库，所有的产品以同样到接口出现，从而氏客户端不依赖于具体实现
 * 优点：具体产品在应用层代码隔离，无需关心实现细节
 *       将一个系列的产品族统一到一起创建
 * 缺点： 规定了所有可能被创建的产品集合，产品族中扩展新到产品困难，需要修改抽象工厂到接口
 *        增加了系统的抽象性和理解难度
 * ps:  产品族与产品等级结构在图片中,与工厂方法的区别在与抽象工厂关注点在与产品族，面向抽象编程
 */
public class Test {

    public static void main(String[] args) {
        FoodAbstractFactory foodAbstractFactory = new AppleFactory();
        Color color = foodAbstractFactory.getColor();
        Smell smell = foodAbstractFactory.getSmell();
        color.getColor();
        smell.getSmell();
    }
}
