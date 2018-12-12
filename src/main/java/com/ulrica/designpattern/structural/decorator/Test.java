package com.ulrica.designpattern.structural.decorator;

import com.ulrica.designpattern.structural.decorator.v1.BatterCakeWithEgg;
import com.ulrica.designpattern.structural.decorator.v1.BatterCakeWithSausage;
import com.ulrica.designpattern.structural.decorator.v2.ABatterCake;
import com.ulrica.designpattern.structural.decorator.v2.BatterCake;
import com.ulrica.designpattern.structural.decorator.v2.EggDecorator;
import com.ulrica.designpattern.structural.decorator.v2.SausageDecorator;

/***
 *装饰者模式
 * 定义：在不改变原有对象的基础上，将功能附加到对象上，提供了比继承更有弹性的替代方案（扩展原有对象功能）
 * 优点：是继承的有力补充，比继承灵活，不改变原有对象的情况下给对象一个扩展功能;
 *      继承的属性为静态的，装饰模式为动态的；
 *      通过使用不同的装饰类以及这些类的排列组合实现不同的效果；
 *      符合开闭原则；
 *  缺点：会出现更多的代码，更多的类，增加程序的复杂性；
 *       动态装饰时，多层装饰会复杂；
 *  jdk 中io出有大量使用
 *@author 180255
 *@creat 2018-12-11-20:21
 */
public class Test {

    /**
     * 采用继承的方式实现，不够灵活会造成类爆炸问题
     * @param args
     */
//    public static void main(String[] args) {
//        BatterCake batterCake = new BatterCake();
//        System.out.println(batterCake.getDesc() + "价格： " + batterCake.cost());
//
//        BatterCake batterCake1 = new BatterCakeWithEgg();
//        System.out.println(batterCake1.getDesc() + "价格： " + batterCake1.cost());
//
//
//        BatterCake batterCake2 = new BatterCakeWithSausage();
//        System.out.println(batterCake2.getDesc() + "价格： " + batterCake2.cost());
//
//
//    }

    /**
     * 装饰者模式
     * @param args
     */
    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        //加一个鸡蛋
        aBatterCake = new EggDecorator(aBatterCake);
        ((EggDecorator) aBatterCake).doSomething();
        //再加一个鸡蛋
        aBatterCake = new EggDecorator(aBatterCake);
        ((EggDecorator) aBatterCake).doSomething();
        //加一个香肠
        aBatterCake = new SausageDecorator(aBatterCake);
        ((SausageDecorator) aBatterCake).doSomething();
        //再加一个香肠
        aBatterCake = new SausageDecorator(aBatterCake);
        ((SausageDecorator) aBatterCake).doSomething();
        System.out.println(aBatterCake.getDesc() + "价格： " + aBatterCake.cost());

    }
}
