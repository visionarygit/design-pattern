package com.ulrica.designpattern.behavioral.cor;

/***
 *职责链模式
 * 该模式构造一系列分别担当不同的职责的类的对象来共同完成一个任务，这些类的对象之间像链条一样紧密相连
 *@author 180255
 *@creat 2019-01-17-9:05
 */
public class Test {
    public static void main(String[] args) {
        CarHandler carHeadHandler = new CarHeadHandler();
        CarHandler carBodyHandler = new CarBodyHandler();
        CarHandler carTailHandler = new CarTailHandler();

        //设置顺序
        carHeadHandler.nextHandler(carBodyHandler).nextHandler(carTailHandler);

        //从头开始执行
        carHeadHandler.handler();
    }
}
