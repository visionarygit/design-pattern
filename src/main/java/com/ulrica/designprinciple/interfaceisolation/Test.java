package com.ulrica.designprinciple.interfaceisolation;

/**
 *定义：用多个专门的接口，而不适用单一的总接口，客户端不应该以来它不需要的接口

 核心：一个类对一个类的依赖应该;建立单一接口，不要建立庞大臃肿的接口；尽量细化接口，接口中的方法尽量少

 优点：符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性
 *
 * AnimalAction 类中包含飞、吃和游泳 粒度太粗职责不清晰，细粒度的类可以进行扩展，但粗粒度的类不能屏蔽
 */
public class Test {

    public static void main(String[] args) {

    }
}
