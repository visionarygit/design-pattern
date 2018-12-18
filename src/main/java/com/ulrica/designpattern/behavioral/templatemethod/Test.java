package com.ulrica.designpattern.behavioral.templatemethod;

/***
 *模板方法模式
 * 定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 *      模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
 * 优点：提高复用性；提高扩展性；符合开闭原则;
 * 缺点：类数目增加；增加了系统的复杂度；继承关系自身缺点，如果父类增加新的抽象方法，所有子类都要改一遍
 *@author 180255
 *@creat 2018-12-18-8:43
 */
public class Test {


    public static void main(String[] args) {
        System.out.println("老板，来个鸡在这吃");
        ACook chicken = new ChickenCook(false);
        chicken.make();

        System.out.println("老板，来个鸭带走");
        ACook duck = new DuckCook(true);
        duck.make();
    }
}
