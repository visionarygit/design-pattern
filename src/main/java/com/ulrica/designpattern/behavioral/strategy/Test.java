package com.ulrica.designpattern.behavioral.strategy;

/***
 *策略模式
 * 它对一系列的算法加以封装，为所有的算法定义一个抽象的算法接口，并通过集成该抽象的算法接口对所有的算法加以封装和实现，集体的算法选择由客户端决定
 * 策略模式主要用来平滑的处理算法的切换
 *@author 180255
 *@creat 2019-01-10-9:31
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        System.out.println(context.cost(55.2d));

        Context context1 = new Context(new StrategyB());
        System.out.println(context1.cost(55.2d));
    }
}
