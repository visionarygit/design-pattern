package com.ulrica.designpattern.structural.decorator.v2;

/***
 *香肠装饰者
 *@author 180255
 *@creat 2018-12-12-8:43
 */
public class SausageDecorator extends ABatterCakeDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public void doSomething() {
        System.out.println("放了一根香肠");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

