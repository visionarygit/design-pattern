package com.ulrica.designpattern.structural.decorator.v2;

/***
 *鸡蛋装饰者
 *@author 180255
 *@creat 2018-12-12-8:41
 */
public class EggDecorator extends ABatterCakeDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public void doSomething() {
        System.out.println("打了一个鸡蛋");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
