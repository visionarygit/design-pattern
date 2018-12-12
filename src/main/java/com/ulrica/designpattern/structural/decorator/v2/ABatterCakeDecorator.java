package com.ulrica.designpattern.structural.decorator.v2;

/***
 *抽象装饰者
 *@author 180255
 *@creat 2018-12-12-8:39
 */
public abstract class ABatterCakeDecorator extends ABatterCake{

    private ABatterCake aBatterCake;

    public ABatterCakeDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    protected abstract void doSomething();

    @Override
    public String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBatterCake.cost();
    }
}
